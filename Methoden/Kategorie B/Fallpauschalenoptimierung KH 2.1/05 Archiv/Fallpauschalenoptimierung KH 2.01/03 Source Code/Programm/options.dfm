object OptionsForm: TOptionsForm
  Left = 0
  Top = 0
  BorderIcons = [biHelp]
  Caption = 'Optionen'
  ClientHeight = 112
  ClientWidth = 476
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  FormStyle = fsMDIChild
  OldCreateOrder = False
  Position = poDefault
  Visible = True
  OnActivate = FormActivate
  OnCreate = FormCreate
  PixelsPerInch = 96
  TextHeight = 13
  object BitBtn2: TBitBtn
    Left = 381
    Top = 87
    Width = 87
    Height = 25
    TabOrder = 1
    OnClick = BitBtn2Click
    Kind = bkAbort
  end
  object BitBtn1: TBitBtn
    Left = 290
    Top = 87
    Width = 85
    Height = 25
    TabOrder = 0
    OnClick = BitBtn1Click
    Kind = bkOK
  end
  object GroupBox1: TGroupBox
    Left = 0
    Top = 0
    Width = 468
    Height = 81
    Caption = 'Verzeichnisse'
    TabOrder = 2
    object Panel1: TPanel
      Left = 8
      Top = 100
      Width = 92
      Height = 21
      BevelOuter = bvLowered
      Caption = 'XA'
      TabOrder = 0
      Visible = False
    end
    object EditXA: TEdit
      Left = 101
      Top = 100
      Width = 348
      Height = 21
      TabOrder = 1
      Visible = False
    end
    object EditMOPS: TEdit
      Left = 101
      Top = 99
      Width = 348
      Height = 21
      TabOrder = 2
      Visible = False
    end
    object Panel2: TPanel
      Left = 8
      Top = 99
      Width = 92
      Height = 21
      BevelOuter = bvLowered
      Caption = 'MOPS'
      TabOrder = 3
      Visible = False
    end
    object Panel3: TPanel
      Left = 8
      Top = 18
      Width = 92
      Height = 21
      BevelOuter = bvLowered
      Caption = 'LPSolve'
      TabOrder = 4
    end
    object EditLPSolve: TEdit
      Left = 101
      Top = 18
      Width = 292
      Height = 21
      TabOrder = 5
    end
    object Panel4: TPanel
      Left = 8
      Top = 98
      Width = 92
      Height = 21
      BevelOuter = bvLowered
      Caption = 'STRADA'
      TabOrder = 6
      Visible = False
    end
    object EditSTRADA: TEdit
      Left = 101
      Top = 98
      Width = 348
      Height = 21
      TabOrder = 7
      Visible = False
    end
    object Panel5: TPanel
      Left = 8
      Top = 100
      Width = 92
      Height = 21
      BevelOuter = bvLowered
      Caption = 'Weidenauer'
      TabOrder = 8
      Visible = False
    end
    object EditWeid: TEdit
      Left = 101
      Top = 100
      Width = 348
      Height = 21
      TabOrder = 9
      Visible = False
    end
    object Panel6: TPanel
      Left = 8
      Top = 45
      Width = 92
      Height = 21
      BevelOuter = bvLowered
      Caption = 'Tempor'#228'r'
      TabOrder = 10
    end
    object EditTemp: TEdit
      Left = 101
      Top = 45
      Width = 292
      Height = 21
      TabOrder = 11
    end
    object btnFindSolver: TButton
      Left = 399
      Top = 16
      Width = 43
      Height = 23
      Caption = '...'
      TabOrder = 12
      OnClick = btnFindSolverClick
    end
    object btnFindWorkSpace: TButton
      Left = 399
      Top = 45
      Width = 43
      Height = 21
      Caption = '...'
      TabOrder = 13
      OnClick = btnFindWorkSpaceClick
    end
  end
  object OpenDialog1: TOpenDialog
    Left = 104
    Top = 80
  end
end
