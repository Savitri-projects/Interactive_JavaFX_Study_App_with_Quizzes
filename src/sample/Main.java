package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    static Stage myStage = new Stage();
    static void format_text(Text t){
        t.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 30));
    }
    static void format_button(Button t){
        t.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 30));
    }
    static void ans_action(Button p, String s){
        p.setOnAction(new EventHandler<ActionEvent>(){
            public void handle(ActionEvent ae){
                p.setText(s);
            }
        });
    }
    public static void start2() {
        myStage.setTitle("App to study");
        TilePane rootNode = new TilePane();
        rootNode.setAlignment(Pos.CENTER);
        Scene window2 = new Scene(rootNode, 1500, 750);
        myStage.setScene(window2);
        //Button goBack = new Button("Go Back");
        //Start Math
        Button c1 = new Button("Engineering Mathematics - IV : 18MA41A");
        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
        c1.setPrefWidth(1000);
        c1.setPrefHeight(100);
        c1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                myStage.setScene(math());
            }
            public Scene math() {
                Button goBacktoCourses = new Button("Go Back");
                //Start unit1 Math
                Button c1 = new Button("Unit - 1 : Graph Theory 1");
                c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c1.setPrefWidth(1000);
                c1.setPrefHeight(100);
                //start Menu unit1 Math
                c1.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 1 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 1 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });

                        goBacktoCourses.setOnAction(e -> myStage.setScene(math()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);
                    }
                });
                //End menu and unit of unit 1 Math
                //Start unit 2 Math
                Button c2 = new Button("Unit - 2 : Graph Theory 2");
                c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c2.setPrefWidth(1000);
                c2.setPrefHeight(100);
                //Start Menu Unit 2 Math
                c2.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 2 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 2 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });

                        goBacktoCourses.setOnAction(e -> myStage.setScene(math()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);
                    }
                });
                //End menu and unit of unit 2 math
                //Start unit3 math
                Button c3 = new Button("Unit - 3 : Graph Theory 3");
                c3.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c3.setPrefWidth(1000);
                c3.setPrefHeight(100);
                //Start Menu of unit 3 math
                c3.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 3 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 3 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });

                        goBacktoCourses.setOnAction(e -> myStage.setScene(math()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);
                    }
                });
                //End of menu and unit of unit3 Math
                //Start of unit 4
                Button c4 = new Button("Unit - 4 : Statistics");
                c4.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c4.setPrefWidth(1000);
                c4.setPrefHeight(100);
                //Start of menu of unit4 Math
                c4.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 4 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 4 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });

                        goBacktoCourses.setOnAction(e -> myStage.setScene(math()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);
                    }
                });
                //End of menu and unit of unit 4
                //Start of unit 5 math
                Button c5 = new Button("Unit - 5 : Random Variables and Probability distributions");
                c5.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c5.setPrefWidth(1000);
                c5.setPrefHeight(100);
                //Start of menu of unit 5 math
                c5.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 5 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 5 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });

                        goBacktoCourses.setOnAction(e -> myStage.setScene(math()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End of menu and unit of unit5
                Button c6 = new Button("Questions and Answers");
                c6.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c6.setPrefWidth(1000);
                c6.setPrefHeight(100);
                c6.setOnAction(new EventHandler <ActionEvent>(){
                    public void handle(ActionEvent ae){Math_quiz m = new Math_quiz();}
                });
                goBacktoCourses.setOnAction(e -> myStage.setScene(window2));
                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                stackPane.setAlignment(Pos.CENTER);
                stackPane.getChildren().addAll(c1, c2, c3, c4, c5,c6, goBacktoCourses);
                return new Scene(stackPane, 1500, 750);

            }//end of Engineering math all units
        });//end of Engineering math on click
        Button c2 = new Button("Biology for Engineers : 18BT42B");
        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
        c2.setPrefWidth(1000);
        c2.setPrefHeight(100);
        c2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                myStage.setScene(bio());
            }

            public Scene bio() {
                Button goBacktoCourses = new Button("Go Back");
                // Start bio unit 1
                Button c1 = new Button("Unit - 1 : Introduction");
                c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c1.setPrefWidth(1000);
                c1.setPrefHeight(100);
                //Start bio unit 1 menu
                c1.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }
                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 1 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 1 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });

                        goBacktoCourses.setOnAction(e -> myStage.setScene(bio()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End bio unit 1 and menu
                //Start bio unit 2
                Button c2 = new Button("Unit - 2 : Genetics and Information transfer");
                c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c2.setPrefWidth(1000);
                c2.setPrefHeight(100);
                //Start bio unit2 menu
                c2.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }
                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 2 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 2 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });

                        goBacktoCourses.setOnAction(e -> myStage.setScene(bio()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End bio unit2 and menu
                //Start bio unit 3
                Button c3 = new Button("Unit - 3 : Bio-inspired Engineering based on human physiology");
                c3.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c3.setPrefWidth(1000);
                c3.setPrefHeight(100);
                //Start bio unit 3 menu
                c3.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }
                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 3 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 3 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(bio()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End bio unit3 and menu
                //Start bio unit 4
                Button c4 = new Button("Unit - 4 : Relevance of Biology as an interdisciplinary approach");
                c4.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c4.setPrefWidth(1000);
                c4.setPrefHeight(100);
                //Start bio unit 4 menu
                c4.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }
                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 4 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 4 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(bio()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End bio unit4 and menu
                //Start bio unit 5
                Button c5 = new Button("Unit - 5 : Bio-inspired Algorithms and Applications");
                c5.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c5.setPrefWidth(1000);
                c5.setPrefHeight(100);
                //End bio unit 5 and menu
                c5.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }
                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 5 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 5 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });

                        goBacktoCourses.setOnAction(e -> myStage.setScene(bio()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                Button c6 = new Button("Questions and Answers");
                c6.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c6.setPrefWidth(1000);
                c6.setPrefHeight(100);
                c6.setOnAction(new EventHandler <ActionEvent>(){
                    public void handle(ActionEvent ae){Bio_Quiz m = new Bio_Quiz();}
                });
                goBacktoCourses.setOnAction(e-> myStage.setScene(window2));
                TilePane stackPane=new TilePane(Orientation.VERTICAL,5,5);
                stackPane.setAlignment(Pos.CENTER);
                stackPane.getChildren().addAll(c1,c2,c3,c4,c5,c6,goBacktoCourses);
                return new Scene(stackPane,1500,750);

            }//end of biology units
        });//end of biology on click
        Button c3 = new Button("Design and Analysis of Algorithms : 18CS43");
        c3.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
        c3.setPrefWidth(1000);
        c3.setPrefHeight(100);
        c3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                myStage.setScene(daa());
            }

            public Scene daa() {
                Button goBacktoCourses = new Button("Go Back");
                //Start daa unit 1
                Button c1 = new Button("Unit - 1 : Introduction,Brute force");
                c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c1.setPrefWidth(1000);
                c1.setPrefHeight(100);
                //Start unit 1 menu daa
                c1.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 1 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 1 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(daa()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 1 and menu daa
                //Start unit 2 daa
                Button c2 = new Button("Unit - 2 : Divide and conquer, Decrease and conquer");
                c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c2.setPrefWidth(1000);
                c2.setPrefHeight(100);
                //Start unit 2 menu daa
                c2.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 2 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 2 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(daa()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 2 and menu daa
                //Start unit 3 daa
                Button c3 = new Button("Unit - 3 : Transform and conquer, Space time trade - offs");
                c3.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c3.setPrefWidth(1000);
                c3.setPrefHeight(100);
                //Start unit 3 menu daa
                c3.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 3 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 3 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(daa()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 3 and menu daa
                //Start unit 4 daa
                Button c4 = new Button("Unit - 4 : Dynamic programming, Greedy technique");
                c4.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c4.setPrefWidth(1000);
                c4.setPrefHeight(100);
                //Start unit 4 menu daa
                c4.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 4 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 4 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(daa()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 4 and menu daa
                //Start unit 5 daa
                Button c5 = new Button("Unit - 5 : Back-tracking, Branch and Bound, NP and NP-Complete Problems");
                c5.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c5.setPrefWidth(1000);
                c5.setPrefHeight(100);
                //Start unit 5 menu daa
                c5.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 5 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 5 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(daa()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 5 and menu daa
                Button c6 = new Button("Questions and Answers");
                c6.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c6.setPrefWidth(1000);
                c6.setPrefHeight(100);
                c6.setOnAction(new EventHandler <ActionEvent>(){
                    public void handle(ActionEvent ae){Daa_Quiz m = new Daa_Quiz();}
                });
                goBacktoCourses.setOnAction(e -> myStage.setScene(window2));
                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                stackPane.setAlignment(Pos.CENTER);
                stackPane.getChildren().addAll(c1, c2, c3, c4, c5, c6, goBacktoCourses);
                return new Scene(stackPane, 1500, 750);

            }//daa units end
        });//course 3 daa onclick end here
        //Mces start
        Button c4 = new Button("Micro-Controllers and Embedded Systems : 18CS44");
        c4.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
        c4.setPrefWidth(1000);
        c4.setPrefHeight(100);
        c4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                myStage.setScene(mces());
            }

            public Scene mces() {
                Button goBacktoCourses = new Button("Go Back");
                //Start unit 1 mces
                Button c1 = new Button("Unit - 1 : Prototyping Hardware-Software Ideas using Open Hardware Platforms");
                c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c1.setPrefWidth(1000);
                c1.setPrefHeight(100);
                //Start unit 1 menu mces
                c1.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 1 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 1 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(mces()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 1 and menu mces
                //Start unit 2 mces
                Button c2 = new Button("Unit - 2 : Introduction to Embedded Systems and ARM Processor/Controller");
                c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c2.setPrefWidth(1000);
                c2.setPrefHeight(100);
                //Start unit 2 menu mces
                c2.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 2 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 2 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(mces()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 2 and menu mces
                //Start unit 3 mces
                Button c3 = new Button("Unit - 3 : ARM Instruction Set & Assembly Language Programming");
                c3.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c3.setPrefWidth(1000);
                c3.setPrefHeight(100);
                //Start unit 3 menu mces
                c3.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 3 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 3 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(mces()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 3 and menu mces
                //Start unit 4 mces
                Button c4 = new Button("Unit - 4 : Interfacing and Application Development Using ARM Microcontroller");
                c4.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c4.setPrefWidth(1000);
                c4.setPrefHeight(100);
                //Start unit 4 menu mces
                c4.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 4 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 4 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(mces()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 4 and menu mces
                //Start unit 5 mces
                Button c5 = new Button("Unit - 5 : Serial Protocols and Embedded System design using ARM-LPC2148");
                c5.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c5.setPrefWidth(1000);
                c5.setPrefHeight(100);
                //Start unit 5 menu mces
                c5.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 5 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 5 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(mces()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 5 end menu mces
                Button c6 = new Button("Questions and Answers");
                c6.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c6.setPrefWidth(1000);
                c6.setPrefHeight(100);
                c6.setOnAction(new EventHandler <ActionEvent>(){
                    public void handle(ActionEvent ae){Mces_Quiz m = new Mces_Quiz();}
                });
                goBacktoCourses.setOnAction(e -> myStage.setScene(window2));
                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                stackPane.setAlignment(Pos.CENTER);
                stackPane.getChildren().addAll(c1, c2, c3, c4, c5, c6, goBacktoCourses);
                return new Scene(stackPane, 1500, 750);

            }//mces units end here
        });//mces on click ends here
        //OOPs start
        Button c5 = new Button("Object Oriented Programming Using Java : 18CS45");
        c5.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
        c5.setPrefWidth(1000);
        c5.setPrefHeight(100);
        c5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                myStage.setScene(oops());
            }

            public Scene oops() {
                Button goBacktoCourses = new Button("Go Back");
                //Start unit 1 oops
                Button c1 = new Button("Unit - 1 : The Object Model, Foundations of the Object Model, Java Programming Fundamentals");
                c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 22));
                c1.setPrefWidth(1000);
                c1.setPrefHeight(100);
                //Start unit 1 menu oops
                c1.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 1 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 1 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(oops()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 1 and menu oops
                //Start unit2 oops
                Button c2 = new Button("Unit - 2 : Inheritance, Packages and Interfaces");
                c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c2.setPrefWidth(1000);
                c2.setPrefHeight(100);
                //Start unit 2 menu oops
                c2.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 2 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 2 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(oops()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 2 and menu oops
                //Start unit 3 oops
                Button c3 = new Button("Unit - 3 : Exception Handling, Multi-threaded Programming");
                c3.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c3.setPrefWidth(1000);
                c3.setPrefHeight(100);
                //Start unit 3 menu oops
                c3.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 3 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 3 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c3 = new Button("Questions and Answers");
                        c3.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c3.setPrefWidth(1000);
                        c3.setPrefHeight(100);
                        goBacktoCourses.setOnAction(e -> myStage.setScene(oops()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 3 and menu oops
                //Start unit 4 oops
                Button c4 = new Button("Unit - 4 : Lambda Expressions, Regular Expressions, String Handling");
                c4.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c4.setPrefWidth(1000);
                c4.setPrefHeight(100);
                //Start unit 4 menu oops
                c4.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 4 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 4 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(oops()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 4 and menu oops
                //Start unit 5 oops
                Button c5 = new Button("Unit - 5 : Collections, JavaFX GUI Programming");
                c5.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c5.setPrefWidth(1000);
                c5.setPrefHeight(100);
                //Start unit 5 menu oops
                c5.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 5 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 5 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(oops()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //End unit 5 and menu oops
                Button c6 = new Button("Questions and Answers");
                c6.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c6.setPrefWidth(1000);
                c6.setPrefHeight(100);
                c6.setOnAction(new EventHandler <ActionEvent>(){
                    public void handle(ActionEvent ae){Oops_Quiz m = new Oops_Quiz();}
                });
                goBacktoCourses.setOnAction(e -> myStage.setScene(window2));
                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                stackPane.setAlignment(Pos.CENTER);
                stackPane.getChildren().addAll(c1, c2, c3, c4, c5, c6, goBacktoCourses);
                return new Scene(stackPane, 1500, 750);

            }//units of oops ends here
        });//c5 - oops on click ends here
        //cn starts
        Button c6 = new Button("Computer Networks : 18CS46");
        c6.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
        c6.setPrefWidth(1000);
        c6.setPrefHeight(100);
        c6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                myStage.setScene(cn());
            }

            public Scene cn() {
                Button goBacktoCourses = new Button("Go Back");
                //Unit 1 cn
                Button c1 = new Button("Unit - 1 : Introduction, Transmission Modes, Link layer, MAC");
                c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c1.setPrefWidth(1000);
                c1.setPrefHeight(100);
                //start unit 1 menu cn
                c1.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 1 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 1 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(cn()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //end unit 1 and menu cn
                //start unit 2 cn
                Button c2 = new Button("Unit - 2 : Network layer design issues, Routing algorithms");
                c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c2.setPrefWidth(1000);
                c2.setPrefHeight(100);
                //start unit 2 menu cn
                c2.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 2 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 2 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(cn()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //end unit 2 and menu cn
                //start unit 3 cn
                Button c3 = new Button("Unit - 3 : Congestion Control Algorithms, Inter-networking");
                c3.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c3.setPrefWidth(1000);
                c3.setPrefHeight(100);
                //start unit 3 menu cn
                c3.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 3 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 3 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(cn()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //end unit 3 and menu cn
                //start unit 4 cn
                Button c4 = new Button("Unit - 4 : The Network Layer in the Internet, Transport Service, The Internet Transport Protocols");
                c4.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 22));
                c4.setPrefWidth(1000);
                c4.setPrefHeight(100);
                //start unit 4 menu cn
                c4.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 4 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 4 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        goBacktoCourses.setOnAction(e -> myStage.setScene(cn()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                //end unit 4 and menu cn
                //start unit 5 cn
                Button c5 = new Button("Unit - 5 : The TCP Protocol, Application Layer");
                c5.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c5.setPrefWidth(1000);
                c5.setPrefHeight(100);
                c5.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent ae) {
                        myStage.setScene(menu());
                    }

                    public Scene menu() {
                        Button goBacktoCourses = new Button("Go Back");
                        Button c1 = new Button("Key Points");
                        c1.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c1.setPrefWidth(1000);
                        c1.setPrefHeight(100);
                        c1.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("Key points of unit 5 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });
                        Button c2 = new Button("References");
                        c2.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                        c2.setPrefWidth(1000);
                        c2.setPrefHeight(100);
                        c2.setOnAction(new EventHandler<ActionEvent>() {
                            public void handle(ActionEvent ae) {
                                myStage.setScene(kps());
                            }
                            public Scene kps(){
                                Button goBacktoMenu = new Button("Go Back");
                                Text kps_ref = new Text("References of unit 5 go here");
                                goBacktoMenu.setOnAction(e -> myStage.setScene(menu()));
                                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                                stackPane.setAlignment(Pos.CENTER);
                                stackPane.getChildren().addAll(kps_ref,goBacktoMenu);
                                return new Scene(stackPane, 1500, 750);
                            }
                        });

                        goBacktoCourses.setOnAction(e -> myStage.setScene(cn()));
                        TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                        stackPane.setAlignment(Pos.CENTER);
                        stackPane.getChildren().addAll(c1, c2, goBacktoCourses);
                        return new Scene(stackPane, 1500, 750);                            }
                });
                Button c6 = new Button("Questions and Answers");
                c6.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
                c6.setPrefWidth(1000);
                c6.setPrefHeight(100);
                c6.setOnAction(new EventHandler <ActionEvent>(){
                    public void handle(ActionEvent ae){Cn_Quiz m = new Cn_Quiz();}
                });
                goBacktoCourses.setOnAction(e -> myStage.setScene(window2));
                TilePane stackPane = new TilePane(Orientation.VERTICAL, 5, 5);
                stackPane.setAlignment(Pos.CENTER);
                stackPane.getChildren().addAll(c1, c2, c3, c4, c5, c6, goBacktoCourses);
                return new Scene(stackPane, 1500, 750);

            }
        });
        //goBack.setOnAction(e-> myStage.setScene(myScene));
        TilePane stackPane=new TilePane(Orientation.VERTICAL,5,5);
        stackPane.setAlignment(Pos.CENTER);
        stackPane.getChildren().addAll(c1,c2,c3,c4,c5,c6);
        //return new Scene(stackPane,1500,750);
        rootNode.getChildren().addAll(c1,c2,c3,c4,c5,c6);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        myStage.setTitle("IV SEM Study Application");
        GridPane rootNode = new GridPane();
        rootNode.setAlignment(Pos.CENTER);
        Scene myScene = new Scene(rootNode, 1500, 750);
        myStage.setScene(myScene);
        Text myLabel = new Text("This is a formulae app. You can get some key points, important formulae, quizzes in here\n\n\n\n");
        myLabel.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 30));
        rootNode.getChildren().addAll(myLabel);
        Button gettingIn = new Button("Let's get started - First check if we have the topic you want to study");
        gettingIn.setFont(Font.font("Comic Sans MS", FontWeight.LIGHT, 25));
        gettingIn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                try {
                    myStage.setScene(searchWindow());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            public Scene searchWindow() throws IOException {
                Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

                myStage.setTitle("IV SEM Study Application");
                Scene searchScene = new Scene(root,1500,700);
                myStage.setScene(searchScene);
                myStage.show();
                return searchScene;
            }
        });
        myStage.show();

        //myStage.show();
        rootNode.add(gettingIn,0,0);
    }


    public static void main(String[] args) {
        launch(args);
    }
}
