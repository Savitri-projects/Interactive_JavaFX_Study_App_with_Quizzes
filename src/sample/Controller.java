package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class Controller implements Initializable {

    ArrayList<String> words = new ArrayList<>(
            Arrays.asList("Engineering Mathematics - IV : 18MA41A", "Unit - 1 : Graph Theory 1",
                    "Unit - 2 : Graph Theory 2", "Unit - 3 : Graph Theory 3", "Unit - 4 : Statistics",
                    "Unit - 5 : Random Variables and Probability distributions", "Biology for Engineers : 18BT42B",
                    "Unit - 1 : Introduction", "Unit - 2 : Genetics and Information transfer",
                    "Unit - 3 : Bio-inspired Engineering based on human physiology",
                    "Unit - 4 : Relevance of Biology as an interdisciplinary approach",
                    "Unit - 5 : Bio-inspired Algorithms and Applications", "Design and Analysis of Algorithms : 18CS43",
                    "Unit - 1 : Introduction,Brute force", "Unit - 2 : Divide and conquer, Decrease and conquer",
                    "Unit - 3 : Transform and conquer, Space time trade - offs", "Unit - 4 : Dynamic programming, Greedy technique",
                    "Unit - 5 : Back-tracking, Branch and Bound, NP and NP-Complete Problems",
                    "Micro-Controllers and Embedded Systems : 18CS44",
                    "Unit - 1 : Prototyping Hardware-Software Ideas using Open Hardware Platforms",
                    "Unit - 2 : Introduction to Embedded Systems and ARM Processor/Controller",
                    "Unit - 3 : ARM Instruction Set & Assembly Language Programming",
                    "Unit - 4 : Interfacing and Application Development Using ARM Microcontroller" ,
                    "Unit - 5 : Serial Protocols and Embedded System design using ARM-LPC2148",
                    "Object Oriented Programming Using Java : 18CS45",
                    "Unit - 1 : The Object Model, Foundations of the Object Model, Java Programming Fundamentals",
                    "Unit - 2 : Inheritance, Packages and Interfaces",
                    "Unit - 3 : Exception Handling, Multi-threaded Programming",
                    "Unit - 4 : Lambda Expressions, Regular Expressions, String Handling",
                    "Unit - 5 : Collections, JavaFX GUI Programming","Computer Networks : 18CS46",
                    "Unit - 1 : Introduction, Transmission Modes, Link layer, MAC",
                    "Unit - 2 : Network layer design issues, Routing algorithms",
                    "Unit - 3 : Congestion Control Algorithms, Inter-networking",
                    "Unit - 4 : The Network Layer in the Internet, Transport Service, The Internet Transport Protocols",
                    "Unit - 5 : The TCP Protocol, Application Layer")
    );

    @FXML
    private TextField searchBar;

    @FXML
    private ListView<String> listView;

    @FXML
    void search(ActionEvent event) {
        listView.getItems().clear();
        listView.getItems().addAll(searchList(searchBar.getText(),words));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.getItems().addAll(words);
    }

    private List<String> searchList(String searchWords, List<String> listOfStrings) {

        List<String> searchWordsArray = Arrays.asList(searchWords.trim().split(" "));

        return listOfStrings.stream().filter(input -> searchWordsArray.stream().allMatch(word ->
                input.toLowerCase().contains(word.toLowerCase()))).collect(Collectors.toList());
    }

    public void startapp() {
        //Stage myStage = new Stage();
        Main.start2();
    }
}