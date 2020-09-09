package sample;

import com.sun.javafx.scene.control.InputField;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    private TextField toptxt;
    private Button cBtn;
    private Button sqrtBtn;
    private Button dividebtn;
    private Button sevenBtn;
    private Button eightBtn;
    private Button nineBtn;
    private Button multiplyBtn;
    private Button fourBtn;
    private Button fiveBtn;
    private Button sixBtn;
    private Button minusBtn;
    private Button oneBtn;
    private Button twoBtn;
    private Button threeBtn;
    private Button plusBtn;
    private Button plusMinusbtn;
    private Button zeroBtn;
    private Button dotbtn;
    private Button equalBtn;
    private VBox root;

//
//    public Button one;
//    public Button two;
//    public Button three;
//    public Button four;
//    public Button five;
//    public Button six;
//    public Button seven;
//    public Button eight;
//    public Button nine;
//    public Button point;
//    public Button clear;
//    public Button plus;
//    public Button minus;
//    public Button muliply;
//    public Button divide;
//    public Button zero;
//    public Button equal;
//
//    public TextField input;
//    public Label label;
//    private VBox root;
//    private HBox fisrtHb,secondHb,thirdHb,fourthHb,fifthHb,sixthHb;
//
//    private long fNumber;
//    private long sNummber;
//    private String operation;
//


   private HBox fisrtHb,secondHb,thirdHb,fourthHb,fifthHb,sixthhb;

    @Override
    public void start(Stage primaryStage) throws Exception{


        toptxt = new TextField();
        toptxt.setText("0");
        toptxt.setPrefWidth(485);
        toptxt.setPrefHeight(60);
        toptxt.setAlignment(Pos.CENTER_RIGHT);
        toptxt.setStyle("-fx-font-size:20px");

        //buttons
        cBtn = new Button("C");
        cBtn.setPrefWidth(120);
        cBtn.setPrefHeight(60);
        cBtn.setStyle("-fx-font-size:20px");
        cBtn.setOnAction(event -> {
            toptxt.setText("0");
        });

        Button xPowerBtn = new Button("x^2");
        xPowerBtn.setPrefWidth(120);
        xPowerBtn.setPrefHeight(60);
        xPowerBtn.setStyle("-fx-font-size:20px");
//        xPowerBtn.setOnAction(event -> {
//            toptxt.setText("x^2");
//        });

        sqrtBtn = new Button("sqrt");
        sqrtBtn.setPrefWidth(120);
        sqrtBtn.setPrefHeight(60);
        sqrtBtn.setStyle("-fx-font-size:20px");

        dividebtn = new Button("/");
        dividebtn.setPrefWidth(120);
        dividebtn.setPrefHeight(60);
        dividebtn.setStyle("-fx-font-size:20px");
        dividebtn.setOnAction(event -> {
            toptxt.setText("/");
        });

        sevenBtn = new Button("7");
        sevenBtn.setPrefWidth(120);
        sevenBtn.setPrefHeight(60);
        sevenBtn.setStyle("-fx-font-size:20px");
        sevenBtn.setOnAction(event -> {
            toptxt.setText("7");
        });

        eightBtn = new Button("8");
        eightBtn.setPrefWidth(120);
        eightBtn.setPrefHeight(60);
        eightBtn.setStyle("-fx-font-size:20px");
        eightBtn.setOnAction(event -> {
            toptxt.setText("8");
        });

        nineBtn = new Button("9");
        nineBtn.setPrefWidth(120);
        nineBtn.setPrefHeight(60);
        nineBtn.setStyle("-fx-font-size:20px");
        nineBtn.setOnAction(event -> {
            toptxt.setText("9");
        });

        multiplyBtn = new Button("*");
        multiplyBtn.setPrefWidth(120);
        multiplyBtn.setPrefHeight(60);
        multiplyBtn.setStyle("-fx-font-size:20px");
        multiplyBtn.setOnAction(event -> {
            toptxt.setText("*");
        });

        fourBtn = new Button("4");
        fourBtn.setPrefWidth(120);
        fourBtn.setPrefHeight(60);
        fourBtn.setStyle("-fx-font-size:20px");
        fourBtn.setOnAction(event -> {
            toptxt.setText("4");
        });

        fiveBtn = new Button("5");
        fiveBtn.setPrefWidth(120);
        fiveBtn.setPrefHeight(60);
        fiveBtn.setStyle("-fx-font-size:20px");
        fiveBtn.setOnAction(event -> {
            toptxt.setText("5");
        });

        sixBtn = new Button("6");
        sixBtn.setPrefWidth(120);
        sixBtn.setPrefHeight(60);
        sixBtn.setStyle("-fx-font-size:20px");
        sixBtn.setOnAction(event -> {
            toptxt.setText("6");
        });

        minusBtn = new Button("-");
        minusBtn.setPrefWidth(120);
        minusBtn.setPrefHeight(60);
        minusBtn.setStyle("-fx-font-size:20px");

        oneBtn = new Button("1");
        oneBtn.setPrefWidth(120);
        oneBtn.setPrefHeight(60);
        oneBtn.setStyle("-fx-font-size:20px");
        oneBtn.setOnAction(event -> {
            toptxt.setText("1");
        });

        twoBtn = new Button("2");
        twoBtn.setPrefWidth(120);
        twoBtn.setPrefHeight(60);
        twoBtn.setStyle("-fx-font-size:20px");
        twoBtn.setOnAction(event -> {
            toptxt.setText("2");
        });

        threeBtn = new Button("3");
        threeBtn.setPrefWidth(120);
        threeBtn.setPrefHeight(60);
        threeBtn.setStyle("-fx-font-size:20px");
        threeBtn.setOnAction(event -> {
            toptxt.setText("3");
        });

        plusBtn = new Button("+");
        plusBtn.setPrefWidth(120);
        plusBtn.setPrefHeight(60);
        plusBtn.setStyle("-fx-font-size:20px");
        plusBtn.setOnAction(event -> {
            toptxt.setText("+");
        });

        plusMinusbtn = new Button("+/-");
        plusMinusbtn.setPrefWidth(120);
        plusMinusbtn.setPrefHeight(60);
        plusMinusbtn.setStyle("-fx-font-size:20px");

        zeroBtn = new Button("0");
        zeroBtn.setPrefWidth(120);
        zeroBtn.setPrefHeight(60);
        zeroBtn.setStyle("-fx-font-size:20px");
        zeroBtn.setOnAction(event -> {
            toptxt.setText("0");
        });

        dotbtn = new Button(".");
        dotbtn.setPrefWidth(120);
        dotbtn.setPrefHeight(60);
        dotbtn.setStyle("-fx-font-size:20px");
        dotbtn.setOnAction(event -> {
            toptxt.setText(".");
        });

        equalBtn = new Button("=");
        equalBtn.setPrefWidth(120);
        equalBtn.setPrefHeight(60);
        equalBtn.setStyle("-fx-font-size:20px");


        //Hboxes
        fisrtHb = new HBox(toptxt);
        secondHb = new HBox(cBtn, xPowerBtn,sqrtBtn,dividebtn);
        thirdHb = new HBox(sevenBtn,eightBtn,nineBtn,multiplyBtn);
        fourthHb = new HBox(fourBtn,fiveBtn,sixBtn,minusBtn);
        fifthHb = new HBox(oneBtn,twoBtn,threeBtn,plusBtn);
        sixthhb = new HBox(plusMinusbtn,zeroBtn,dotbtn,equalBtn);
        //Vbox
        root = new VBox(fisrtHb,secondHb,thirdHb,fourthHb,fifthHb,sixthhb);


        primaryStage.setTitle("Calculator-17238020");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMaxWidth(480);
        primaryStage.setMinWidth(480);
        primaryStage.setMaxHeight(360);
        primaryStage.setMinHeight(360);
        primaryStage.show();
//
//        fisrtHb = new HBox(input);
//        secondHb = new HBox(clear,clear,clear,clear);
//        thirdHb = new HBox(seven,eight,nine,divide);
//        fourthHb = new HBox(four,five,six,muliply);
//        fifthHb = new HBox(one,two,three,minus);
//        sixthHb = new HBox(zero,equal,point,plus);
//
//        root = new VBox(fisrtHb,secondHb,thirdHb,fourthHb,fifthHb,sixthHb);
//        primaryStage.setTitle("17238020 CP Calculator");
//        Scene scene = new Scene(root, 300, 275);
//
//        primaryStage.setScene(scene);
//
//        primaryStage.show();
////
    }
//
//    public void point_click(){
//        String oldValue = input.getText();
//        String set = ".";
//        input.setText(oldValue + set);
//    }
//    public void zero_click(){
//        String oldValue = input.getText();
//        String set = "0";
//        input.setText(oldValue + set);
//    }
//    public void one_click(){
//        String oldValue = input.getText();
//        String set = "1";
//        input.setText(oldValue + set);
//    }
//    public void two_click(){
//        String oldValue = input.getText();
//        String set = "2";
//        input.setText(oldValue + set);
//    }
//    public void three_click(){
//        String oldValue = input.getText();
//        String set = "3";
//        input.setText(oldValue + set);
//    }
//    public void four_click(){
//        String oldValue = input.getText();
//        String set = "4";
//        input.setText(oldValue + set);
//    }
//    public void five_click(){
//        String oldValue = input.getText();
//        String set = "5";
//        input.setText(oldValue + set);
//    }
//    public void six_click(){
//        String oldValue = input.getText();
//        String set = "6";
//        input.setText(oldValue + set);
//    }
//    public void seven_click(){
//        String oldValue = input.getText();
//        String set = "7";
//        input.setText(oldValue + set);
//    }
//    public void eight_click(){
//        String oldValue = input.getText();
//        String set = "8";
//        input.setText(oldValue + set);
//    }
//    public void nine_click(){
//        String oldValue = input.getText();
//        String set = "9";
//        input.setText(oldValue + set);
//    }
//    public void clear_click(){
//        input.setText("");
//        label.setText("");
//        this.fNumber = 0;
//        this.sNummber =0;
//
//    }
//    public void plus_click(){
//        String value = input.getText();
//        long valueNumber = Integer.parseInt(value);
//        this.fNumber = valueNumber;
//        input.setText("");
//        label.setText(value + "+");
//        operation = "+";
//    }
//    public void minus_click(){
//        String value = input.getText();
//        long valueNumber = Integer.parseInt(value);
//        this.fNumber = valueNumber;
//        input.setText("");
//        label.setText(value + "-");
//        operation = "-";
//    }
//    public void multiply_click(){
//        String value = input.getText();
//        long valueNumber = Integer.parseInt(value);
//        this.fNumber = valueNumber;
//        input.setText("");
//        label.setText(value + "*");
//        operation = "*";
//    }
//    public void divide_click(){
//        String value = input.getText();
//        long valueNumber = Integer.parseInt(value);
//        this.fNumber = valueNumber;
//        input.setText("");
//        label.setText(value + "*");
//        operation = "*";
//    }
//    public void equal_click(){
//        switch (operation){
//            case "+":
//                String valuePlus = input.getText();
//                this.sNummber = Integer.parseInt(valuePlus);
//                long system = this.fNumber + this.sNummber;
//                input.setText(String.valueOf(system));
//                String oldLbl = label.getText();
//                label.setText(oldLbl+valuePlus);
//                break;
//            case "-":
//                String valueMinus = input.getText();
//                this.sNummber = Integer.parseInt(valueMinus);
//                long systemMinus = this.fNumber - this.sNummber;
//                input.setText(String.valueOf(systemMinus));
//                String oldLblMinus = label.getText();
//                label.setText(oldLblMinus+valueMinus);
//                break;
//            case "*":
//                String valueMultiply = input.getText();
//                this.sNummber = Integer.parseInt(valueMultiply);
//                long systemMultiply = this.fNumber * this.sNummber;
//                input.setText(String.valueOf(systemMultiply));
//                String oldLblMultiply = label.getText();
//                label.setText(oldLblMultiply+valueMultiply);
//                break;
//            case "/":
//                String valueDivide = input.getText();
//                this.sNummber = Integer.parseInt(valueDivide);
//                long systemDivide = this.fNumber / this.sNummber;
//                input.setText(String.valueOf(systemDivide));
//                String oldLblDivide = label.getText();
//                label.setText(oldLblDivide+valueDivide);
//                break;
//        }
//        }


    public static void main(String[] args) {
        launch(args);
    }


}

