package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.managepage.Login.Login;
import org.umssdiplo.automationv01.core.managepage.Project.Projects;
import org.umssdiplo.automationv01.core.managepage.dialogo.RegistroDialogo;
import org.umssdiplo.automationv01.core.utils.LoadPage;
import org.umssdiplo.automationv01.core.utils.LoadProjectsPage;

public class StepsDefinitionPHPtravel {
    private Login login;
    private Projects projects;
    //private Proyecto proyecto;
    private RegistroDialogo registroDialogo;

    @Given("^'PHP travel' page is loaded$")
    public void phpTravelPageIsLoaded() throws Throwable {
        login = LoadPage.loginPage();
    }

    @And("^set my credentials on 'Login' page$")
    public void setMyCredentialsOnLoginPage() throws Throwable {
        login.setCredentials();
    }

    @Given("^'Project' page is loaded$")
    public void ssiPageIsLoaded() throws Throwable {
        projects = LoadProjectsPage.projectPage();
    }

    @And("^click on 'configuracion' button in 'Project' page$")
    public void clickConfiguracionProjectButtonInProjectPage() {
        registroDialogo = projects.clickPlusIcon();
    }


    @When("^insert \"([^\"]*)\" project name field in 'Form Project' page$")
    public void insertProjectNameFieldInDialogProjectPage(String nameProject) throws Throwable {
        registroDialogo.insertProjectName(nameProject);
    }


    @When("^type \"(.*)\" in Modelo field$")
    public void typeValueInModelField(String nameProject) throws Throwable {
        registroDialogo.typeValueInModelo(nameProject);
    }

    @And("^type \"([^\"]*)\" in Capaciad field$")
    public void typeValueInCapacidadField(String nameProject) throws Throwable {
        registroDialogo.typeValueInCapacidad(nameProject);
    }

    @And("^type \"([^\"]*)\" in Precio field$")
    public void typeInPrecioField(String nameProject) throws Throwable {
        registroDialogo.typeValueInPrecio(nameProject);
    }

    @And("^type \"([^\"]*)\" in SubCategoriaId field$")
    public void typeInSubCategoriaIdField(String nameProject) throws Throwable {
        registroDialogo.typeValueInSubCategoriaId(nameProject);
    }




    //@When("^click on \"Enviar\" button$")
    @When("^click on 'Enviar' button$")
    public void clickOnEnviarButton() throws Throwable {
        registroDialogo.clickEnviarBoton();
    }

    @When("^click on 'Category' button$")
    public void clickOnCategoryButton() throws Throwable {
        registroDialogo.clickCategoryBoton();
    }

    @And("^click on 'Tractores' submenu$")
    public void clickOnTractoresSubmenu() throws Throwable {
        registroDialogo.clickTractoresBoton();
    }

    /*@And("^click on 'Eliminar' button$")
    public void clickOnEliminarButton() throws Throwable {
        registroDialogo.clickEliminarBoton();

    }*/







    /*@Then("^should see \"(.*)\" on the table$")
    public void shouldSeeModelOnImae(String modelo) throws Throwable {
        String actualResult = registroDialogo.getModelFromImage();
        Assert.assertEquals(modelo, actualResult, "El modelo no es correcto");
    }*/


}
