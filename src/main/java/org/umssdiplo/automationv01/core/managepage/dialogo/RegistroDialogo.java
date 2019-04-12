package org.umssdiplo.automationv01.core.managepage.dialogo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class RegistroDialogo extends BasePage {
    @FindBy(xpath = "/html/body/app-root/app-configuracion/div")
    private WebElement containerDialog;

    @FindBy(name = "marca")
    private WebElement projectNameField;

    @FindBy(name = "modelo")
    private WebElement modeloField;

    @FindBy(name = "capacidad")
    private WebElement capacidadField;

    @FindBy(id = "precio")
    private WebElement precioField;

    @FindBy(id = "subCategoriaId")
    private WebElement subCategoriaIdField;


    //@FindBy(xpath = "//button[@type='submit']")
    @FindBy(xpath = "/html/body/app-root/app-configuracion/div/form/div[6]/button")
    private WebElement enviarBotton;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
    private WebElement categoriaBotton;

    @FindBy(xpath = "/html/body/app-root/app-catalog/div/div[1]/div/a[1]")
    private WebElement tractoresBotton;

    /*@FindBy(xpath = "//*[@id=\"pills-tractores\"]/div/div[7]/div/div/div/div[2]/button[2]")
    private WebElement eliminarBotton;*/


    public RegistroDialogo() {
        CommonEvents.waitWebElementVisible(containerDialog);
    }

    public void insertProjectName(String nameProject){
        CommonEvents.setInputField(projectNameField, nameProject);
    }

    public void typeValueInModelo(String modelo){
        CommonEvents.setInputField(modeloField, modelo);
    }

    public void typeValueInCapacidad(String modelo){
        CommonEvents.setInputField(capacidadField, modelo);
    }

    public void typeValueInPrecio(String modelo){
        CommonEvents.setInputField(precioField, modelo);
    }

    public void typeValueInSubCategoriaId(String modelo){
        CommonEvents.setInputField(subCategoriaIdField, modelo);
    }

    public void clickEnviarBoton(){
        CommonEvents.clickButton(enviarBotton);
    }

    public void clickCategoryBoton(){
        CommonEvents.clickButton(categoriaBotton);
    }

    public void clickTractoresBoton(){
        CommonEvents.clickButton(tractoresBotton);
    }

    //public void clickEliminarBoton(){
       // CommonEvents.clickButton(eliminarBotton);
    //}

}
