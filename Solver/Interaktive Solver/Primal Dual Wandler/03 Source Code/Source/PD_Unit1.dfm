object Form1: TForm1
  Left = 351
  Top = 180
  Hint = 'Um die Berechnung durchzuf'#252'hren'
  Caption = 'Primal - Dual - Wandler'
  ClientHeight = 451
  ClientWidth = 706
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  Icon.Data = {
    0000010001001010100001000400280100001600000028000000100000002000
    0000010004000000000000000000600000006100000010000000000000000000
    0000000080000080000000808000800000008000800080800000C0C0C0008080
    80000000FF0000FF000000FFFF00FF000000FF00FF00FFFF0000FFFFFF004444
    4444444444444444444FFFFFFF444444444F00000FF44444444F000000F44FFF
    F44F00FF00F44F00F44F00FF00F44F00F44F00FF00F44F00FFFF00FF00F44F00
    000F000000F44F00000F00000FF44F00FF0FFFFFFF444F00FF00F44444444F00
    0000F44444444F00000FF44444444FFFFFFF4444444444444444444444440000
    0000000000000000000000000000000000000000000000000000000000000000
    000000000000000000000000000000000000000000000000000000000000}
  Menu = MainMenu
  OldCreateOrder = True
  Position = poScreenCenter
  Visible = True
  OnActivate = FormActivate
  OnClose = FormClose
  OnCreate = FormCreate
  PixelsPerInch = 96
  TextHeight = 13
  object Ansicht: TPageControl
    Left = 16
    Top = 16
    Width = 673
    Height = 505
    ActivePage = Linearmodell
    TabOrder = 0
    object Linearmodell: TTabSheet
      Caption = 'Linearmodell'
      DragMode = dmAutomatic
      object OptimierungGroup: TRadioGroup
        Left = 248
        Top = 8
        Width = 129
        Height = 81
        Caption = 'Optimierung'
        ItemIndex = 0
        Items.Strings = (
          'Maximierung'
          'Minimierung')
        TabOrder = 0
        OnClick = OptimierungGroupClick
      end
      object EinstellungBox: TGroupBox
        Left = 16
        Top = 8
        Width = 225
        Height = 81
        Caption = 'Einstellungen'
        TabOrder = 1
        object BezAnzVariable: TLabel
          Left = 8
          Top = 24
          Width = 59
          Height = 13
          Caption = 'AnzVariable:'
        end
        object BezAnzRestriktionen: TLabel
          Left = 120
          Top = 24
          Width = 83
          Height = 13
          Caption = 'AnzRestriktionen:'
        end
        object AnzVariable: TSpinEdit
          Left = 8
          Top = 40
          Width = 89
          Height = 22
          EditorEnabled = False
          Font.Charset = DEFAULT_CHARSET
          Font.Color = clWindowText
          Font.Height = -11
          Font.Name = 'MS Sans Serif'
          Font.Style = []
          MaxValue = 40
          MinValue = 1
          ParentFont = False
          TabOrder = 0
          Value = 4
          OnChange = AnzVariableChange
        end
        object AnzRestriktionen: TSpinEdit
          Left = 120
          Top = 40
          Width = 89
          Height = 22
          EditorEnabled = False
          MaxValue = 40
          MinValue = 1
          TabOrder = 1
          Value = 4
          OnChange = AnzRestriktionenChange
        end
      end
      object UmformButton: TButton
        Left = 536
        Top = 432
        Width = 113
        Height = 33
        Caption = 'Umformen'
        Default = True
        TabOrder = 2
        OnClick = UmformButtonClick
      end
      object LinearModellBox: TGroupBox
        Left = 17
        Top = 95
        Width = 537
        Height = 321
        Caption = 'Linearmodell'
        TabOrder = 3
        object LinearGrid: TStringGrid
          Left = 3
          Top = 27
          Width = 521
          Height = 265
          Options = [goFixedVertLine, goFixedHorzLine, goVertLine, goHorzLine, goRangeSelect, goEditing, goTabs, goThumbTracking]
          TabOrder = 0
          OnTopLeftChanged = LinearGridTopLeftChanged
          ColWidths = (
            64
            64
            64
            64
            64)
          RowHeights = (
            24
            24
            24
            24
            24)
        end
        object ZFLinearGrid: TStringGrid
          Left = 3
          Top = 285
          Width = 521
          Height = 33
          RowCount = 1
          FixedRows = 0
          Options = [goFixedVertLine, goFixedHorzLine, goVertLine, goHorzLine, goRangeSelect, goEditing, goTabs]
          ScrollBars = ssNone
          TabOrder = 1
          OnTopLeftChanged = ZFLinearGridTopLeftChanged
          ColWidths = (
            64
            64
            64
            64
            64)
          RowHeights = (
            24)
        end
      end
      object VZBeschraenkungBoxLinear: TGroupBox
        Left = 560
        Top = 96
        Width = 81
        Height = 321
        Hint = 
          'Durch markieren k'#246'nnen Sie angeben, welche Variablen Vorzeichenu' +
          'nbeschr'#228'nkt sind'
        Caption = 'Vorzeichen'
        ParentShowHint = False
        ShowHint = True
        TabOrder = 4
        object VorzeichenLinear: TListBox
          Left = 8
          Top = 16
          Width = 57
          Height = 297
          ItemHeight = 13
          MultiSelect = True
          TabOrder = 0
        end
      end
      object Button1: TButton
        Left = 392
        Top = 64
        Width = 113
        Height = 25
        Caption = 'Initialisieren'
        TabOrder = 5
        OnClick = Button1Click
      end
    end
    object Dualmodell: TTabSheet
      Caption = 'Dualmodell'
      object DualmodellBox: TGroupBox
        Left = 16
        Top = 8
        Width = 537
        Height = 409
        Caption = 'Dualmodell'
        TabOrder = 0
        object DualGrid: TStringGrid
          Left = 8
          Top = 16
          Width = 521
          Height = 353
          Options = [goFixedVertLine, goFixedHorzLine, goVertLine, goHorzLine, goRangeSelect, goEditing, goTabs, goThumbTracking]
          TabOrder = 0
          OnTopLeftChanged = DualGridTopLeftChanged
          ColWidths = (
            64
            64
            64
            64
            64)
          RowHeights = (
            24
            24
            24
            24
            24)
        end
        object ZFDualGrid: TStringGrid
          Left = 8
          Top = 368
          Width = 521
          Height = 33
          Enabled = False
          RowCount = 1
          FixedRows = 0
          ScrollBars = ssNone
          TabOrder = 1
          OnTopLeftChanged = ZFDualGridTopLeftChanged
          ColWidths = (
            64
            64
            64
            64
            64)
          RowHeights = (
            24)
        end
      end
      object VZBeschraenkungsBoxDual: TGroupBox
        Left = 560
        Top = 8
        Width = 81
        Height = 409
        Caption = 'Vorzeichen'
        ParentShowHint = False
        ShowHint = True
        TabOrder = 1
        object VorzeichenDual: TListBox
          Left = 8
          Top = 16
          Width = 57
          Height = 385
          ItemHeight = 13
          MultiSelect = True
          TabOrder = 0
        end
      end
      object Button2: TButton
        Left = 536
        Top = 432
        Width = 113
        Height = 33
        Caption = 'Vereinfachen'
        TabOrder = 2
        OnClick = Button2Click
      end
    end
  end
  object AnzVarHidden: TEdit
    Left = 192
    Top = 0
    Width = 57
    Height = 21
    TabOrder = 1
    Visible = False
  end
  object AnzResHidden: TEdit
    Left = 256
    Top = 0
    Width = 57
    Height = 21
    TabOrder = 2
    Visible = False
  end
  object MainMenu: TMainMenu
    Left = 420
    object Datei1: TMenuItem
      Caption = '&Datei'
      object Neu1: TMenuItem
        Caption = '&Neu'
        OnClick = Neu1Click
      end
      object Oeffnen1: TMenuItem
        Caption = #214'&ffnen'
        OnClick = Oeffnen1Click
      end
      object N1: TMenuItem
        Caption = '-'
      end
      object Speichern1: TMenuItem
        Caption = '&Speichern'
        OnClick = Speichern1Click
      end
      object Speichernunter1: TMenuItem
        Caption = 'Speichern &unter ...'
        OnClick = Speichernunter1Click
      end
      object N2: TMenuItem
        Caption = '-'
      end
      object Beenden1: TMenuItem
        Caption = '&Beenden'
        OnClick = Beenden1Click
      end
    end
    object Funktionen1: TMenuItem
      Caption = '&Funktionen'
      object Umformen1: TMenuItem
        Caption = '&Umformen'
        ShortCut = 120
        OnClick = Umformen1Click
      end
      object Initialisieren1: TMenuItem
        Caption = '&Initialisieren'
        ShortCut = 121
        OnClick = Initialisieren1Click
      end
      object N3: TMenuItem
        Caption = '-'
      end
      object ErstelleDokument: TMenuItem
        Caption = '&Erstelle Dokument'
        ShortCut = 122
        OnClick = ErstelleDokument1Click
      end
    end
    object Hilfe1: TMenuItem
      Caption = '&Hilfe'
      object Inhalt1: TMenuItem
        Caption = '&Inhalt'
        OnClick = Inhalt1Click
      end
      object N4: TMenuItem
        Caption = '-'
      end
      object Ueber1: TMenuItem
        Caption = '&Info ...'
        OnClick = Ueber1Click
      end
    end
  end
  object OeffnenDatei: TOpenDialog
    Left = 488
  end
  object SpeichernDatei: TSaveDialog
    Left = 456
  end
end
