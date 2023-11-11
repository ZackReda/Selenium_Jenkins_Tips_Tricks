package com.testAutomationFramework.actionsImp.ui;

public class UiActionsDto {
    public ElementActions elementActions;
   public  BrowserActions browserActions;
    public UiSupportedLibraries library;
    public UiActionsDto(BrowserActions browserActions, ElementActions uiActions )
    {
        this.browserActions = browserActions;
        this.elementActions = uiActions;
    }
    public UiActionsDto(BrowserActions browserActions, ElementActions uiActions, UiSupportedLibraries lib )
    {
        this.browserActions = browserActions;
        this.elementActions = uiActions;
        this.library=lib;
    }
    public void setLibrary(UiSupportedLibraries lib){
        this.library=lib;
    }


}
