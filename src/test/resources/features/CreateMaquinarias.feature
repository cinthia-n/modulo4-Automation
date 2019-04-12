# Login feature review the behavior in thie feature
Feature: Projects

  Background: Creacion de maquinarias y Eliminar maquinaria
    Given 'Project' page is loaded


  Scenario: Crear maquinaria
    And click on 'configuracion' button in 'Project' page
    When insert "ABC marca" project name field in 'Form Project' page
    And type "ABC Modelo" in Modelo field
    And type "ABC Capacidad" in Capaciad field
    And type "123" in Precio field
    And type "1" in SubCategoriaId field
    And click on 'Enviar' button
    #Then should see "ABC marca" on the table

   Scenario: Eliminar maquinaria
    And click on 'categoria' button in 'Project' page
    And click on 'Tractores' submenu
    And click on 'Eliminar' button


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





