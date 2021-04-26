package opintopiiri.ui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import opintopiiri.dao.UserDao;
import opintopiiri.domain.Functions;
import opintopiiri.domain.User;
import opintopiiri.dao.Quiz2;
import opintopiiri.dao.Quiz3;

public class UI extends Application {

    Functions functions = new Functions(this);
    /*Button registerButton= new Button();
    Button loginButton= new Button();
    Label registerErrorLabel= new Label();
    Label errorLabel= new Label();
    TextField usernameField= new TextField();
    PasswordField passwordField= new PasswordField();
    TextField newUsernameField= new TextField();
    PasswordField newPasswordField= new PasswordField();
    Button createNew=new Button();
    Button returnToLogin=new Button();*/
    UserDao userdao;
    Quiz2 quiz2;
    Quiz3 quiz3;
    String username;
    String password;
    int q1noplayed;
    double q1average;
    int q2noplayed;
    double q2average;
    String answerTrimmed;
    private int i;

    public UI() {
        this.userdao = new UserDao(new User(username, password, q1noplayed, q1average, q2noplayed, q2average));
        this.quiz2 = new Quiz2();
        this.quiz3 = new Quiz3();
        this.i = 0;

    }

    @Override
    public void start(Stage stage) throws SQLException, ClassNotFoundException {
        //eka login näyttö
        //this.userdao.resetH2();
        stage.setTitle("Opintopiiri Sovellus");

        //this.userdao.createConnection();
        //loginscene
        Label usernameText = new Label("Username:");
        TextField usernameField = new TextField();
        Label passwordText = new Label("Password:");
        PasswordField passwordField = new PasswordField();
        Button loginButton = new Button("Login");
        Button registerButton = new Button("Register");
        Label errorLabel = new Label("");

        GridPane login = new GridPane();
        login.setPrefSize(800, 500);
        login.setAlignment(Pos.CENTER);
        login.setVgap(25);
        login.setHgap(40);
        login.setPadding(new Insets(5, 5, 5, 5));

        login.add(usernameText, 0, 0);
        login.add(usernameField, 1, 0);
        login.add(passwordText, 0, 1);
        login.add(passwordField, 1, 1);
        login.add(loginButton, 1, 2);
        login.add(registerButton, 1, 3);
        login.add(errorLabel, 1, 4);

        Scene loginScene = new Scene(login);
        stage.setScene(loginScene);

        //registerScene luodaan
        Label newUsernameText = new Label("New username:");
        TextField newUsernameField = new TextField();
        Label newPasswordText = new Label("New password:");
        PasswordField newPasswordField = new PasswordField();
        Button createNew = new Button("Create a new user");
        Button returnToLogin = new Button("Return to login screen");
        Label registerErrorLabel = new Label("");

        GridPane register = new GridPane();
        register.setPrefSize(800, 500);
        register.setAlignment(Pos.CENTER);
        register.setVgap(25);
        register.setHgap(40);
        register.setPadding(new Insets(5, 5, 5, 5));

        register.add(newUsernameText, 0, 0);
        register.add(newUsernameField, 1, 0);
        register.add(newPasswordText, 0, 1);
        register.add(newPasswordField, 1, 1);
        register.add(createNew, 1, 2);
        register.add(returnToLogin, 1, 3);
        register.add(registerErrorLabel, 1, 4);

        Scene registerScene = new Scene(register);

        //luodaan gamemenuScene
        Label gamemenutext = new Label("Choose a quiz to play or view stats");
        Button quiz1 = new Button("Quiz 1: Fish");
        Button quiz2 = new Button("Quiz 2: ");
        Button seeStats = new Button("See stats");

        GridPane gamemenu = new GridPane();
        gamemenu.setPrefSize(800, 500);
        gamemenu.setAlignment(Pos.CENTER);
        gamemenu.setVgap(25);
        gamemenu.setHgap(40);
        gamemenu.setPadding(new Insets(5, 5, 5, 5));

        gamemenu.add(gamemenutext, 0, 0);
        gamemenu.add(quiz1, 1, 0);
        gamemenu.add(quiz2, 2, 0);
        gamemenu.add(seeStats, 4, 0);

        Scene gamemenuScene = new Scene(gamemenu);

        //luodaan gamescene QUIZ 1
        //ERI QUIZES ERI SCENET
        //tätä sitten muokataan, otsikkoa, kysymyksiä, vastauksia jne
        Label gametext = new Label("Quiz 1: Fish " + "\n" + "Type in the answer in the box below");
        Label question = new Label("What kind of fish is Nemo in the movie 'Finding Nemo'?" + "\n" + "a:Tiger Shark " + "\n" + "b:Salmon " + "\n" + "c:Clownfish " + "\n" + "d: Goldfish");
        TextField answer = new TextField();
        Button next = new Button("Next");

        GridPane game = new GridPane();
        game.setPrefSize(800, 500);
        game.setAlignment(Pos.CENTER);
        game.setVgap(25);
        game.setHgap(40);
        game.setPadding(new Insets(5, 5, 5, 5));

        game.add(gametext, 0, 0);
        game.add(question, 1, 0);
        game.add(answer, 1, 1);
        game.add(next, 2, 1);

        Scene gameScene = new Scene(game);

        //gameoverscene
        Label overtext = new Label("Game over!");
        Label percentage = new Label("");
        Button goBackToMenu = new Button("Go back to menu");

        GridPane gameover = new GridPane();
        gameover.setPrefSize(800, 500);
        gameover.setAlignment(Pos.CENTER);
        gameover.setVgap(25);
        gameover.setHgap(40);
        game.setPadding(new Insets(5, 5, 5, 5));

        gameover.add(overtext, 0, 0);
        gameover.add(percentage, 0, 1);
        gameover.add(goBackToMenu, 0, 2);

        Scene gameoverScene = new Scene(gameover);

        //statsScene
        Label statsText = new Label("STATS");
        Label stats1 = new Label("You have played Quiz 1 " + this.functions.noOfTimesPlayed(1) + " times" + "\n" + "and your average score for Quiz 1 is " + this.functions.countAverage(1) + "");
        Button goBack2 = new Button("Return to menu");

        GridPane stats = new GridPane();
        stats.setPrefSize(800, 500);
        stats.setAlignment(Pos.CENTER);

        stats.add(statsText, 0, 0);
        stats.add(stats1, 0, 1);
        stats.add(goBack2, 0, 2);

        Scene statsScene = new Scene(stats);

        //siirrytään loginista pelimenuun
        loginButton.setOnAction((event) -> {
            try {
                username = usernameField.getText().trim();
                password = passwordField.getText().trim();
                if (!this.userdao.checkIfUserExists(username)) {
                    errorLabel.setText("No user with this username was found");
                } else {
                    if (this.userdao.checkIfUsernameMatchesPassword(username, password)) {
                        stage.setScene(gamemenuScene);
                    } else {
                        errorLabel.setText("Username and password don't match");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        //siirrytään rekisteröitymiseen
        registerButton.setOnAction((event) -> {
            stage.setScene(registerScene);
        });

        //siirrytään takaisin loginnäyttöön rekisteröitymisestä
        returnToLogin.setOnAction((event) -> {
            stage.setScene(loginScene);
        });
        //luodaan uusi käyttäjä ja muokataan tekstiä TOIMII
        createNew.setOnAction((event) -> {
            try {
                username = newUsernameField.getText().trim();
                password = newPasswordField.getText().trim();

                if (this.userdao.checkIfUserExists(username)) {
                    registerErrorLabel.setText("This username is already taken");

                } else {
                    //System.out.println("ei ole db uutta käyttäjää vielä");
                    this.userdao.addUser(new User(username, password, 0, 0, 0, 0));
                    registerErrorLabel.setText("New user created!");
                }

            } catch (SQLException ex) {
                //System.out.println("sql ongelma create new nappi");
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            }

        });

        //siirrytään peliin 1
        quiz1.setOnAction((event) -> {
            stage.setScene(gameScene);
        });

        // siirrytään vastauksesta seuraavaan kysym, muokkaa scenea sopivaksi
        next.setOnAction((event) -> {
            question.setText(this.functions.getQ());
            answerTrimmed = answer.getText().trim().toLowerCase();
            if (answerTrimmed.equals(this.functions.getA())) {
                this.functions.increasePoints();
            }
            if (!this.functions.checkIfMoreQs()) {
                //System.out.println("sisällä");
                percentage.setText("You got " + this.functions.getPoints() + "/8 correct!");
                stage.setScene(gameoverScene);
            }
            answer.setText("");
        });

        //palaa menuun 1 scenestä
        goBackToMenu.setOnAction((event) -> {
            this.functions.addNoOfTimesPlayed(1);
            this.functions.addPoints(this.functions.getPoints());
            //this.functions.countAverage(1);
            this.functions.indexToZero();
            question.setText("What kind of fish is Nemo in the movie 'Finding Nemo'?" + "\n" + "a:Tiger Shark " + "\n" + "b:Salmon " + "\n" + "c:Clownfish " + "\n" + "d: Goldfish");
            stage.setScene(gamemenuScene);
        });

        //mene stats
        seeStats.setOnAction((event) -> {
            this.functions.countAverage(1);
            //muillekkin samat
            stats1.setText("You have played Quiz 1 " + this.functions.noOfTimesPlayed(1) + " times" + "\n" + "and your average score for Quiz 1 is " + this.functions.countAverage(1) + "");
            stage.setScene(statsScene);
        });
        goBack2.setOnAction((event) -> {
            stage.setScene(gamemenuScene);
        });

        //lopussa vaan show
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
