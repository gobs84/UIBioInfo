package application;
	

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage primaryStage) {
		try {
            primaryStage.setTitle("Menu Principal");
            Label labelTitle = new Label("Bienvenido");
            labelTitle.relocate(20, 10);
            Button btnRegistro = new Button();
            btnRegistro.setText("Registrar Paciente");
            btnRegistro.relocate(20, 40);
            btnRegistro.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    registrarWindow();
                }
            });
            Button btnConsulta = new Button();
            btnConsulta.setText("Consulta");
            btnConsulta.relocate(20, 70);
            btnConsulta.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Consulta");
                    consultaWindow();
                }
            });
            Button btnEmergencia = new Button();
            btnEmergencia.setText("Emergencia");
            btnEmergencia.relocate(20, 100);
            btnEmergencia.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Emergencia");
                }
            });
            Button btnPersonal = new Button();
            btnPersonal.setText("Registrar Personal");
            btnPersonal.relocate(20, 130);
            btnPersonal.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Personal");
                    personalWindow();
                }
            });
            
            Button btgarante = new Button();
            btgarante.setText("Registrar Garante");
            btgarante.relocate(20, 160);
            btgarante.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    System.out.println("Garante");
                    garanteWindow();
                }
            });
            
            Pane root = new Pane();
            root.getChildren().add(btnRegistro);
            root.getChildren().add(btnConsulta);
            root.getChildren().add(btnEmergencia);
            root.getChildren().add(btnPersonal);
            root.getChildren().add(btgarante);
            root.getChildren().add(labelTitle);
            Scene scene = new Scene(root,250,200);
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void registrarWindow() {
        Pane registroLayout = new Pane();
        Scene registroScene = new Scene(registroLayout, 300, 450);
        Stage registroStage = new Stage();
        registroStage.setTitle("Datos del Paciente");
        registroStage.setScene(registroScene);
        Label nameLabel = new Label("Nombre");
        nameLabel.relocate(10, 20);
        TextField nameTf = new TextField();
        nameTf.relocate(90, 20);
        Label lnamePLabel = new Label("Apellido P");
        lnamePLabel.relocate(10, 50);
        TextField lnamePTf = new TextField();
        lnamePTf.relocate(90, 50);
        Label lnameMLabel = new Label("Apellido M");
        lnameMLabel.relocate(10, 80);
        TextField lnameMTf = new TextField();
        lnameMTf.relocate(90, 80);
        Label genderLabel = new Label("Genero");
        genderLabel.relocate(10, 110);
        ComboBox<String> genderComboBox = new ComboBox<String>();
        genderComboBox.getItems().addAll(
            "Masculino",
            "Femenino",
            "Otro"  
        );
        genderComboBox.relocate(90, 110);
        Label dateBLabel = new Label("F. Nacimiento");
        dateBLabel.relocate(10, 140);
        DatePicker dateBPicker = new DatePicker();
        dateBPicker.relocate(90, 140);
        Label addressLabel = new Label("Direccion");
        addressLabel.relocate(10, 170);
        TextField addressTf = new TextField();
        addressTf.relocate(90, 170);
        Label phoneLabel = new Label("Telefono");
        phoneLabel.relocate(10, 200);
        TextField phoneTf = new TextField();
        phoneTf.relocate(90, 200);
        Label nationalityLabel = new Label("Nacionalidad");
        nationalityLabel.relocate(10, 230);
        TextField nationalityTf = new TextField();
        nationalityTf.relocate(90, 230);
        Label insuranceLabel = new Label("Aseguradora");
        insuranceLabel.relocate(10, 260);
        TextField insuranceTf = new TextField();
        insuranceTf.relocate(90, 260);
        Label alergyLabel = new Label("Alergia");
        alergyLabel.relocate(10, 290);
        TextField alergyyTf = new TextField();
        alergyyTf.relocate(90, 290);
        Label deathFlagLabel = new Label("Fallecio");
        deathFlagLabel.relocate(10, 320);
        ComboBox<String> deathFlagComboBox = new ComboBox<String>();
        deathFlagComboBox.getItems().addAll(
            "True",
            "False"  
        );
        deathFlagComboBox.relocate(90, 320);
        Label dateDLabel = new Label("F. Muerte");
        dateDLabel.relocate(10, 350);
        DatePicker dateDPicker = new DatePicker();
        dateDPicker.relocate(90, 350);
        
		Button btnRegistro = new Button();
        btnRegistro.setText("Registrar Paciente");
        btnRegistro.relocate(50, 400);
        btnRegistro.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	registroStage.hide();
            	System.out.println(nameTf.getText());
            }
        });
        registroLayout.getChildren().add(nameLabel);
        registroLayout.getChildren().add(nameTf);
        registroLayout.getChildren().add(lnamePLabel);
        registroLayout.getChildren().add(lnamePTf);
        registroLayout.getChildren().add(lnameMLabel);
        registroLayout.getChildren().add(lnameMTf);
        registroLayout.getChildren().add(genderLabel);
        registroLayout.getChildren().add(genderComboBox);
        registroLayout.getChildren().add(dateBLabel);
        registroLayout.getChildren().add(dateBPicker);
        registroLayout.getChildren().add(addressLabel);
        registroLayout.getChildren().add(addressTf);
        registroLayout.getChildren().add(phoneLabel);
        registroLayout.getChildren().add(phoneTf);
        registroLayout.getChildren().add(nationalityLabel);
        registroLayout.getChildren().add(nationalityTf);
        registroLayout.getChildren().add(insuranceLabel);
        registroLayout.getChildren().add(insuranceTf);
        registroLayout.getChildren().add(alergyLabel);
        registroLayout.getChildren().add(alergyyTf);
        registroLayout.getChildren().add(deathFlagLabel);
        registroLayout.getChildren().add(deathFlagComboBox);
        registroLayout.getChildren().add(dateDLabel);
        registroLayout.getChildren().add(dateDPicker);
        registroLayout.getChildren().add(btnRegistro);
        registroStage.show();
	}
	
	public void consultaWindow() 
	{
		Pane consultaLayout = new Pane();
        Scene personalScene = new Scene(consultaLayout, 300, 200);
        Stage personalStage = new Stage();
        personalStage.setTitle("Generar Consulta");
        personalStage.setScene(personalScene);
        Label pacienteLabel = new Label("Paciente");
        pacienteLabel.relocate(10, 20);
        ComboBox<String> pacienteComboBox = new ComboBox<String>();//se pone entre parentesis la lista
        pacienteComboBox.relocate(90, 20);
        Label medicoLabel = new Label("Medico");
        medicoLabel.relocate(10, 50);
        ComboBox<String> medicoComboBox = new ComboBox<String>();
        medicoComboBox.relocate(90, 50);
        Label dateDLabel = new Label("Fecha");
        dateDLabel.relocate(10, 80);
        DatePicker dateDPicker = new DatePicker();
        dateDPicker.relocate(90, 80);
        
		Button btnRegistro = new Button();
        btnRegistro.setText("Agendar Consutla");
        btnRegistro.relocate(50, 120);
        btnRegistro.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	personalStage.hide();
            }
        });
        consultaLayout.getChildren().add(pacienteLabel);
        consultaLayout.getChildren().add(pacienteComboBox);
        consultaLayout.getChildren().add(medicoLabel);
        consultaLayout.getChildren().add(medicoComboBox);
        consultaLayout.getChildren().add(dateDLabel);
        consultaLayout.getChildren().add(dateDPicker);
        consultaLayout.getChildren().add(btnRegistro);
        personalStage.show();
	}
	
	public void emergenciaWindow()
	{
		Pane emergenciaLayout = new Pane();
        Scene emergenciaScene = new Scene(emergenciaLayout, 200, 100);
        Stage emergenciaStage = new Stage();
        emergenciaStage.setTitle("Generar Consulta");
        emergenciaStage.setScene(emergenciaScene);
        
		Button btnPNew = new Button();
        btnPNew.setText("Paciente Nuevo");
        btnPNew.relocate(20, 20);
        btnPNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	emergenciaStage.hide();
            }
        });
        
        Button btnasegurado = new Button();
        btnasegurado.setText("Paciente Asegurado");
        btnasegurado.relocate(20, 50);
        btnasegurado.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	emergenciaStage.hide();
            }
        });
        emergenciaLayout.getChildren().add(btnPNew);
        emergenciaLayout.getChildren().add(btnasegurado);
        emergenciaStage.show();
	}
	
	public void personalWindow()
	{
		Pane personalLayout = new Pane();
        Scene personalScene = new Scene(personalLayout, 300, 320);
        Stage personalStage = new Stage();
        personalStage.setTitle("Datos del Personal");
        personalStage.setScene(personalScene);
        Label nameLabel = new Label("Nombre");
        nameLabel.relocate(10, 20);
        TextField nameTf = new TextField();
        nameTf.relocate(90, 20);
        Label lnamePLabel = new Label("Apellido P");
        lnamePLabel.relocate(10, 50);
        TextField lnamePTf = new TextField();
        lnamePTf.relocate(90, 50);
        Label lnameMLabel = new Label("Apellido M");
        lnameMLabel.relocate(10, 80);
        TextField lnameMTf = new TextField();
        lnameMTf.relocate(90, 80);
        Label genderLabel = new Label("Genero");
        genderLabel.relocate(10, 110);
        ComboBox<String> genderComboBox = new ComboBox<String>();
        genderComboBox.getItems().addAll(
            "Masculino",
            "Femenino",
            "Otro"  
        );
        genderComboBox.relocate(90, 110);
        Label addressLabel = new Label("Direccion");
        addressLabel.relocate(10, 140);
        TextField addressTf = new TextField();
        addressTf.relocate(90, 140);
        Label phoneLabel = new Label("Telefono");
        phoneLabel.relocate(10, 170);
        TextField phoneTf = new TextField();
        phoneTf.relocate(90, 170);
        Label specialityLabel = new Label("Especialidad");
        specialityLabel.relocate(10, 200);
        TextField specialityTf = new TextField();
        specialityTf.relocate(90, 200);
        Label tipoLabel = new Label("Tipo");
        tipoLabel.relocate(10, 230);
        TextField tipoTf = new TextField();
        tipoTf.relocate(90, 230);
        
		Button btnRegistro = new Button();
        btnRegistro.setText("Registrar Personal");
        btnRegistro.relocate(50, 280);
        btnRegistro.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	personalStage.hide();
            	System.out.println(nameTf.getText());
            }
        });
        personalLayout.getChildren().add(nameLabel);
        personalLayout.getChildren().add(nameTf);
        personalLayout.getChildren().add(lnamePLabel);
        personalLayout.getChildren().add(lnamePTf);
        personalLayout.getChildren().add(lnameMLabel);
        personalLayout.getChildren().add(lnameMTf);
        personalLayout.getChildren().add(genderLabel);
        personalLayout.getChildren().add(genderComboBox);
        personalLayout.getChildren().add(addressLabel);
        personalLayout.getChildren().add(addressTf);
        personalLayout.getChildren().add(phoneLabel);
        personalLayout.getChildren().add(phoneTf);
        personalLayout.getChildren().add(specialityLabel);
        personalLayout.getChildren().add(specialityTf);
        personalLayout.getChildren().add(tipoLabel);
        personalLayout.getChildren().add(tipoTf);
        personalLayout.getChildren().add(btnRegistro);
        personalStage.show();
	}
	
	public void newEmergencia() 
	{
		
	}
	
	public void aseguradoEmergencia()
	{
	
	}
	
	public void garanteWindow()
	{
		Pane garanteLayout = new Pane();
        Scene garanteScene = new Scene(garanteLayout, 300, 300);
        Stage garanteStage = new Stage();
        garanteStage.setTitle("Datos del Garante");
        garanteStage.setScene(garanteScene);
        Label nameLabel = new Label("Nombre");
        nameLabel.relocate(10, 20);
        TextField nameTf = new TextField();
        nameTf.relocate(90, 20);
        Label addressLabel = new Label("Direccion");
        addressLabel.relocate(10, 50);
        TextField addressTf = new TextField();
        addressTf.relocate(90, 50);
        Label phoneLabel = new Label("Telefono");
        phoneLabel.relocate(10, 80);
        TextField phoneTf = new TextField();
        phoneTf.relocate(90, 80);
        Label typeLabel = new Label("Tipo");
        typeLabel.relocate(10, 110);
        TextField typeTf = new TextField();
        typeTf.relocate(90, 110);
        Label patientIdLabel = new Label("Paciente");
        patientIdLabel.relocate(10, 140);
        ComboBox<String> patientIdComboBox = new ComboBox<String>();
        patientIdComboBox.relocate(90, 140);
        Label deathFlagLabel = new Label("Fallecio");
        deathFlagLabel.relocate(10, 170);
        ComboBox<String> deathFlagComboBox = new ComboBox<String>();
        deathFlagComboBox.getItems().addAll(
            "True",
            "False"  
        );
        deathFlagComboBox.relocate(90, 170);
        Label dateDLabel = new Label("F. Muerte");
        dateDLabel.relocate(10, 200);
        DatePicker dateDPicker = new DatePicker();
        dateDPicker.relocate(90, 200);
        
		Button btnRegistro = new Button();
        btnRegistro.setText("Registrar Garante");
        btnRegistro.relocate(50, 250);
        btnRegistro.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	garanteStage.hide();
            	System.out.println(nameTf.getText());
            }
        });
        garanteLayout.getChildren().add(nameLabel);
        garanteLayout.getChildren().add(nameTf);
        garanteLayout.getChildren().add(patientIdLabel);
        garanteLayout.getChildren().add(patientIdComboBox);
        garanteLayout.getChildren().add(addressLabel);
        garanteLayout.getChildren().add(addressTf);
        garanteLayout.getChildren().add(phoneLabel);
        garanteLayout.getChildren().add(phoneTf);
        garanteLayout.getChildren().add(typeLabel);
        garanteLayout.getChildren().add(typeTf);
        garanteLayout.getChildren().add(deathFlagLabel);
        garanteLayout.getChildren().add(deathFlagComboBox);
        garanteLayout.getChildren().add(dateDLabel);
        garanteLayout.getChildren().add(dateDPicker);
        garanteLayout.getChildren().add(btnRegistro);
        garanteStage.show();
	}
}
