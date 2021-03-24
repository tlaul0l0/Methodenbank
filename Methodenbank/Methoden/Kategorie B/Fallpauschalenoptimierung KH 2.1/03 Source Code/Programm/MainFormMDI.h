//----------------------------------------------------------------------------------------//
// Startseite des Programms                                                               //
// hier befindet sich das Men� (Datei und Hilfe)                                          //
// Datei �ffnet neue Seite und beendet Anwendung                                          //
// Hilfe enth�lt Hilfefunktion (Bug! Hilfe �ffnet sich hinter dem Hauptfenster) und About //
//----------------------------------------------------------------------------------------//


#ifndef MainFormH
#define MainFormH
//---------------------------------------------------------------------------
#include <Classes.hpp>
#include <Controls.hpp>
#include <StdCtrls.hpp>
#include <Forms.hpp>
#include <Menus.hpp>
#include <ExtCtrls.hpp>
#include <ComCtrls.hpp>
#include <Dialogs.hpp>
#include <ImgList.hpp>
#include <ToolWin.hpp>

#include <fstream.h>

//---------------------------------------------------------------------------
class TMainForm : public TForm
{
__published:	// IDE-managed Components
        TMainMenu *MainMenu1;
        TMenuItem *Datei1;
        TMenuItem *MenueNeu;
        TMenuItem *Beenden1;
        TMenuItem *N1;
        TMenuItem *Hilfe1;
        TMenuItem *Inhalt1;
        TMenuItem *N3;
        TMenuItem *ber1;
	TMenuItem *N2;
	TMenuItem *MenueOeffnen;
	TMenuItem *MenueSpeichern;
	TMenuItem *MenueSpeichernUnter;
	TOpenDialog *OpenDialog1;
	TSaveDialog *SaveDialog1;
	TImageList *ImageList1;
	TToolBar *MainToolBar;
	TToolButton *NewToolButton;
	TToolButton *OpenToolButton;
	TToolButton *SaveToolButton;
	TToolButton *ToolButton3;
	TToolButton *ResetToolButton;
	TToolButton *CalculateToolButton;
	TStatusBar *StatusBar;
	TToolButton *ToolButtonCloseChild;
	TMenuItem *Einstellungen1;
	TMenuItem *Extras1;
	TToolButton *ToolButton1;
	TToolButton *ToolButton2;
	TToolButton *ToolButton4;
	TMenuItem *Bearbeiten1;
	TMenuItem *Ausschneiden1;
	TMenuItem *Kopieren1;
	TMenuItem *Einfgen1;
	TMenuItem *Lschen1;
        void __fastcall Beenden1Click(TObject *Sender);
        void __fastcall MenueNeuClick(TObject *Sender);
        void __fastcall ber1Click(TObject *Sender);
        void __fastcall Inhalt1Click(TObject *Sender);
	void __fastcall MenueSpeichernClick(TObject *Sender);
	void __fastcall MenueSpeichernUnterClick(TObject *Sender);
	void __fastcall MenueOeffnenClick(TObject *Sender);
	void __fastcall CalculateToolButtonClick(TObject *Sender);
	void __fastcall ResetToolButtonClick(TObject *Sender);
	void __fastcall OpenToolButtonClick(TObject *Sender);
	void __fastcall SaveToolButtonClick(TObject *Sender);
	void __fastcall NewToolButtonClick(TObject *Sender);
	void __fastcall ToolButtonCloseChildClick(TObject *Sender);
	void __fastcall Einstellungen1Click(TObject *Sender);
	void __fastcall ToolButton1Click(TObject *Sender);
private:	// User declarations
	bool MenueNeuesFormular();
	bool speichernUnter();
	bool oeffnen();
public:		// User declarations
	  __fastcall TMainForm(TComponent* Owner);
	  string solverFilePath;
	  string workSpacePath;
	  bool closeChildForm();
};
//---------------------------------------------------------------------------
extern PACKAGE TMainForm *MainForm;
//---------------------------------------------------------------------------
#endif
