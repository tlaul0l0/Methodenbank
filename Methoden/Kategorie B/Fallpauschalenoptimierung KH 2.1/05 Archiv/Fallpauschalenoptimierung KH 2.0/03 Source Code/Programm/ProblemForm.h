
//-- Nutzen der Datei -----------------------------------------------------------//
// Datei dient der Eingabe von Daten �ber die Anzahl der Betten im Krankenhaus,  //
// die Dauer des Berechnungszeitaumes und die Anzahl der Fallklassen.            //
// Danach werden die Werte f�r die einzelnen Fallklassen eingegeben              //
//                                                                               //
// Auf diesem Formular gibt es drei Buttons; <Abbrechen> <Zur�cksetzen> <Weiter> //
//-------------------------------------------------------------------------------//

#ifndef ProblemFormH
#define ProblemFormH
//---------------------------------------------------------------------------
#include <Classes.hpp>
#include <Controls.hpp>
#include <StdCtrls.hpp>
#include <Forms.hpp>
#include <ComCtrls.hpp>
#include <ExtCtrls.hpp>
#include <DBCtrls.hpp>
#include <DBGrids.hpp>
#include <Grids.hpp>
#include <Buttons.hpp>

#include "verketteteListe.h"
#include <iostream>
#include <string>

#include <fstream.h>
#include <string.h>
#include <ctype.h>

class TFormEingabe1 : public TForm
{
__published:	// IDE-managed Components
		TTabControl *mainTabControl;
		TGroupBox *GroupBox1;
		TLabeledEdit *LabelBettenanzahl;
		TLabeledEdit *LabelBerechnungszeitraum;
		TLabeledEdit *LabelAnzahlFallpauschalen;
		TUpDown *UpDownAnzahlFallpauschalen;
		TStringGrid *StringGridTabelle;
		TMemo *MemoEingabe1;
		TGroupBox *GroupBox2;
		TGroupBox *GroupBoxHotelleistung;
		TLabeledEdit *LabelHotelleistung;
		TGroupBox *GroupBoxPersonal;
		TLabeledEdit *LabelArbeitszeitKS;
		TLabeledEdit *LabelGehaltKS;
		TGroupBox *GroupBoxOP;
		TLabeledEdit *LabelAuslastungOP;
		TLabeledEdit *LabelKostenOP;
		TGroupBox *GroupBoxLabor;
		TLabeledEdit *LabelAuslastungLabor;
		TLabeledEdit *LabelKostenLabor;
		TLabeledEdit *LabelDeckungsbeitragLabor;
		TGroupBox *GroupBoxRoentgen;
		TLabeledEdit *LabelRoentgenArbeitszeit;
		TLabeledEdit *LabelKostenRoentgen;
		TLabeledEdit *LabelKostenNeuesGeraet;
		TLabeledEdit *LabelErloesAltesGeraet;
		TGroupBox *GroupBox3;
		TGroupBox *GroupBoxZfWert;
		TLabel *LabelZf;
		TGroupBox *GroupBoxFallpauschalen;
		TLabel *LabelFallp;
		TStringGrid *StringTabelleErgebnis;
		TGroupBox *GroupBoxAnzahlKrankenschwestern;
		TLabel *LabelAnzahlKS;
		TGroupBox *GroupBox4;
		TLabel *Label2;
		TLabel *LabelLaborWert;
		TGroupBox *GroupBoxGeraet;
		TLabel *LabelRoentgen;
	TLabeledEdit *LabelAbschreibungsDauer;
	TLabeledEdit *LabelM;
        void __fastcall UpDownAnzahlFallpauschalenClick(TObject *Sender,
		  TUDBtnType Button);
		void __fastcall mainTabControlChange(TObject *Sender);
	void __fastcall OnActivate(TObject *Sender);
private:	// User declarations
		bool resBetten(double &bettenBerechnungszeitraum);
		bool resPflegebedarf(double &arbeitszeitBerechnungszeitraum);
		bool resOpSaal(double &auslastungOPZeitraum);
		bool resLabor(double &auslastungLaborGesamt);
		bool resRoentgen(double &roentgenAufwandBerechnungszeitraum);
		bool zielfunktion(double &hotelleistung, double &bZeitraum);
		bool nnb(Liste &restriktionRoentgenNeu);
		int zaehler;
		void restriktionSchreiben(char *fileName, Liste *restriktion, double bValue);
		void zielfunktionSchreiben(char *fileName, Liste *zielfunktion);
		void nnbSchreiben(char *fileName, Liste *restriktion);
		bool setFieldValue(int index, string *value);
		void formatiereMatrix(int anzahlZeilen);
		static int totalFormCount;
		int formId;
		void clearSolution();
public:		// User declarations
		__fastcall TFormEingabe1(TComponent* Owner);
		int anzahl;
		void setZahl( int elem )
		{
				anzahl = elem;
		};
		int getZahl( )
		{
				return anzahl;
		};

		char *fileName;
		bool checkFields1();
		bool checkFields2();
		bool saveFile();
		bool loadFile();
		bool berechnen();
		bool zuruecksetzen();
};
//---------------------------------------------------------------------------
extern PACKAGE TFormEingabe1 *FormEingabe1;
//---------------------------------------------------------------------------
#endif


