﻿//------------------------------------------------------------------------------
// <auto-generated>
//     Dieser Code wurde von einem Tool generiert.
//     Laufzeitversion:4.0.30319.42000
//
//     Änderungen an dieser Datei können falsches Verhalten verursachen und gehen verloren, wenn
//     der Code erneut generiert wird.
// </auto-generated>
//------------------------------------------------------------------------------

namespace OrAlpha.Properties {
    
    
    [global::System.Runtime.CompilerServices.CompilerGeneratedAttribute()]
    [global::System.CodeDom.Compiler.GeneratedCodeAttribute("Microsoft.VisualStudio.Editors.SettingsDesigner.SettingsSingleFileGenerator", "14.0.0.0")]
    public sealed partial class Settings : global::System.Configuration.ApplicationSettingsBase {
        
        private static Settings defaultInstance = ((Settings)(global::System.Configuration.ApplicationSettingsBase.Synchronized(new Settings())));
        
        public static Settings Default {
            get {
                return defaultInstance;
            }
        }
        
        [global::System.Configuration.UserScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.DefaultSettingValueAttribute("dummy.html")]
        public string PlaceholderHtmlFile {
            get {
                return ((string)(this["PlaceholderHtmlFile"]));
            }
            set {
                this["PlaceholderHtmlFile"] = value;
            }
        }
        
        [global::System.Configuration.UserScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.DefaultSettingValueAttribute("C:\\Methodenbank\\DATEN\\")]
        public string HtmlPath {
            get {
                return ((string)(this["HtmlPath"]));
            }
            set {
                this["HtmlPath"] = value;
            }
        }
        
        [global::System.Configuration.UserScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.DefaultSettingValueAttribute("C:\\Methodenbank\\OR_ALPHA\\or-alpha.xml")]
        public string XmlFilePath {
            get {
                return ((string)(this["XmlFilePath"]));
            }
            set {
                this["XmlFilePath"] = value;
            }
        }
        
        [global::System.Configuration.UserScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.DefaultSettingValueAttribute("C:\\Methodenbank\\DATEN\\HTML-Files\\OR_ALPHA_HILFE.html")]
        public string HelpFile {
            get {
                return ((string)(this["HelpFile"]));
            }
            set {
                this["HelpFile"] = value;
            }
        }
        
        [global::System.Configuration.ApplicationScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.DefaultSettingValueAttribute("C:\\Methodenbank\\")]
        public string DeploymentSourcePath {
            get {
                return ((string)(this["DeploymentSourcePath"]));
            }
        }
        
        [global::System.Configuration.ApplicationScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.DefaultSettingValueAttribute("\\\\merkur.htwg-konstanz.de\\work\\ORALPHA_SS15")]
        public string DeploymentDestinationPath {
            get {
                return ((string)(this["DeploymentDestinationPath"]));
            }
        }
        
        [global::System.Configuration.UserScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.DefaultSettingValueAttribute("C:\\\\Methodenbank\\\\OR_ALPHA\\\\Visual-OR-TreeView_V1.xml")]
        public string VisualORTreeview {
            get {
                return ((string)(this["VisualORTreeview"]));
            }
            set {
                this["VisualORTreeview"] = value;
            }
        }
        
        [global::System.Configuration.UserScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.DefaultSettingValueAttribute("C:\\Methodenbank\\OR_ALPHA\\Visual_OR\\")]
        public string SolverSolution {
            get {
                return ((string)(this["SolverSolution"]));
            }
            set {
                this["SolverSolution"] = value;
            }
        }
        
        [global::System.Configuration.UserScopedSettingAttribute()]
        [global::System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [global::System.Configuration.DefaultSettingValueAttribute("C:\\\\Methodenbank\\\\Solver\\\\")]
        public string SolverProcess {
            get {
                return ((string)(this["SolverProcess"]));
            }
            set {
                this["SolverProcess"] = value;
            }
        }
    }
}