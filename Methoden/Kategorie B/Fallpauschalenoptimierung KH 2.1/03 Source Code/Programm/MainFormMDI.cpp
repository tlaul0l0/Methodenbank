//----------------------------------------------------------------------------------------//
// Startseite des Programms                                                               //
// hier befindet sich das Men� (Datei und Hilfe)                                          //
// Datei �ffnet neue Seite und beendet Anwendung                                          //
// Hilfe enth�lt Hilfefunktion (Bug! Hilfe �ffnet sich hinter dem Hauptfenster) und About //
//----------------------------------------------------------------------------------------//

#include <vcl.h>
#pragma hdrstop

#include "MainFormMDI.h"
#include "ProblemForm.h"
#include "verketteteListe.h"
#include "options.h"
#include "About.h"
#include "registry.h"
#include "common.h"

#include <iostream>
#include <fstream>
#include <string>
using namespace std;

//---------------------------------------------------------------------------
#pragma package(smart_init)
#pragma resource "*.dfm"
TMainForm *MainForm;
//TFormEingabe1 *activeEingabeForm;
//---------------------------------------------------------------------------
__fastcall TMainForm::TMainForm(TComponent* Owner)
        : TForm(Owner)
{
	this->workSpacePath = "C:/TEMP/FOP/";
	this->solverFilePath = "C:/TEMP/FOP/LP_SOLVE.EXE";
	this->Left = 0;
	this->Top = 0;
}
//---------------------------------------------------------------------------
void __fastcall TMainForm::Beenden1Click(TObject *Sender)
{
		//Beenden schlie�t die Anwendung
        Close();        
}
//---------------------------------------------------------------------------
void __fastcall TMainForm::MenueNeuClick(TObject *Sender)
{
	MenueNeuesFormular();
}

bool TMainForm::MenueNeuesFormular()
{
	//bei Auswahl von "Neu" werden alle Feldinhalte gel�scht und leere Formulare angezeigt
		FormEingabe1 = new TFormEingabe1(this);

		FormEingabe1->Show();
		FormEingabe1->zuruecksetzen();

		FormEingabe1->fileName = NULL;
		FormEingabe1->Caption = "[NEU]";

		return true;
}

void __fastcall TMainForm::MenueSpeichernClick(TObject *Sender)
{
		//Speichern
	if(FormEingabe1->fileName != NULL)
		FormEingabe1->saveFile();
	else
		speichernUnter();
}
//---------------------------------------------------------------------------

void __fastcall TMainForm::MenueSpeichernUnterClick(TObject *Sender)
{
	speichernUnter();
}

bool TMainForm::speichernUnter()
{
	//Speichern unter
	//TMDIChild* Child = (TMDIChild*)ActiveMDIChild;
	SaveDialog1->InitialDir = reg_getdatadir();
	SaveDialog1->FileName = "newfile.fpo";

	char* supported_filelist[1] = { "fpo" };

	if (SaveDialog1->Execute())
	{
	  char dir[256];
	  getcwd(dir, sizeof(dir));
	  reg_setdatadir(dir);
	  char file[1024];

	  strpncpy(file, SaveDialog1->Files->Strings[0].c_str(), sizeof(file));

	  char* dotpos = strrchr(file, '.');

	  FormEingabe1->fileName = file;
	  FormEingabe1->Caption = FormEingabe1->fileName;
	  FormEingabe1->saveFile();
	}
	else
	{
		return false;
	}

	return true;
}
//---------------------------------------------------------------------------

void __fastcall TMainForm::MenueOeffnenClick(TObject *Sender)
{
	oeffnen();
}
//---------------------------------------------------------------------------

bool TMainForm::oeffnen()
{
	// �ffnen

	OpenDialog1->InitialDir = reg_getdatadir();          // Datei -> Oeffnen

	if (OpenDialog1->Execute())
	{
		// open the dialog box
		char dir[200];
		getcwd(dir,sizeof(dir));       // gets current working directory
		reg_setdatadir(dir);          // das letze Verz. wird in der Registry gespeichert
        FormEingabe1 = new TFormEingabe1(this);
		FormEingabe1->fileName = OpenDialog1->FileName.c_str();
		FormEingabe1->Caption = FormEingabe1->fileName;
		FormEingabe1->loadFile();
		return true;
	}

	return false;
}

//---------------------------------------------------------------------------
void __fastcall TMainForm::ber1Click(TObject *Sender)
{
	//"�ber" �ffnet das Fenster mit den allgemeinen Infos �ber die Software
        AboutBox->ShowModal();
}
//---------------------------------------------------------------------------
void __fastcall TMainForm::Inhalt1Click(TObject *Sender)
{
		//�ffnen der Hilfe
		//Fehler, Hilfe hinter Hauptfenster, bug leider nicht gefunden
		Application->HelpCommand(HELP_FINDER, 0);
}

void __fastcall TMainForm::CalculateToolButtonClick(TObject *Sender)
{
	if(FormEingabe1 != NULL)
		FormEingabe1->berechnen();
}
//---------------------------------------------------------------------------

void __fastcall TMainForm::ResetToolButtonClick(TObject *Sender)
{
	if(FormEingabe1 != NULL)
	{
		if(Application->MessageBoxA("Wollen Sie die Eingaben wirklich l�schen?", "R�cksetzen", MB_YESNO | MB_ICONQUESTION) == IDYES)
		{
			FormEingabe1->zuruecksetzen();
		}
    }
}
//---------------------------------------------------------------------------


void __fastcall TMainForm::OpenToolButtonClick(TObject *Sender)
{
	oeffnen();	
}
//---------------------------------------------------------------------------

void __fastcall TMainForm::SaveToolButtonClick(TObject *Sender)
{
		//Speichern
	if(FormEingabe1->fileName != NULL)
		FormEingabe1->saveFile();
	else
		speichernUnter();	
}
//---------------------------------------------------------------------------



void __fastcall TMainForm::NewToolButtonClick(TObject *Sender)
{
	MenueNeuesFormular();
}
//---------------------------------------------------------------------------


void __fastcall TMainForm::ToolButtonCloseChildClick(TObject *Sender)
{
	closeChildForm();
}
//---------------------------------------------------------------------------

bool TMainForm::closeChildForm()
{
	try
	{
		if(OptionsForm != NULL)
		{
			TOptionsForm *tmp = OptionsForm;
			OptionsForm = NULL;
			delete tmp;
			return true;
		}

		if(FormEingabe1 != NULL)
		{
			TFormEingabe1 *tmp = FormEingabe1;
			FormEingabe1 = NULL;
			delete tmp;
		}

    	return true;
	}
	catch(Exception &e)
	{
		  return false;
	}
}

void __fastcall TMainForm::Einstellungen1Click(TObject *Sender)
{
	OptionsForm = new TOptionsForm(this);
	OptionsForm->Show();
}
//---------------------------------------------------------------------------

void __fastcall TMainForm::ToolButton1Click(TObject *Sender)
{
	OptionsForm = new TOptionsForm(this);
	OptionsForm->Show();	
}
//---------------------------------------------------------------------------

