# Login feature review the behavior in thie feature
Feature: Projects

  Background: Creacion de maquinarias
    Given 'Project' page is loaded


  Scenario: Crear maquinaria
    And click on 'configuracion' button in 'Project' page
    When insert "ABC marca" project name field in 'Form Project' page
    And type "ABC Modelo" in Modelo field
    And type "ABC Capacidad" in Capaciad field
    And type "123" in Precio field
    And type "1" in SubCategoriaId field
    And click on 'Enviar' button
    And click on 'Category' button
    And click on 'Tractores' submenu
    #Then should see "ABC marca" on the table

  #Scenario Outline: Crear maquinaria2
    #And click on 'configuracion' button in 'Project' page
    #When insert "<Marca>" project name field in 'Form Project' page
    #And type "<Modelo>" in Modelo field
    #And type "ABC Modelo" in Capaciad field
    #And type "ABC Modelo" in Precios field
    #And click on "Enviar" button
    #And click on 'Category' manu
    #And click on "Tractores" submenu
    #Then should see "ABC marca" on the table

   # Examples:
     # | Modelo | Marca       |
      #| ABC123 | MarcaABC123 |
     # | yz123  | Marcayz123  |
  #Scenario: Eliminar maquinaria
    #And click on 'Eliminar' button



