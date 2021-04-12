
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
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import opintopiiri.dao.UserDao;
import opintopiiri.domain.Functions;
import opintopiiri.domain.User;
        
public class UI extends Application{
    Functions functions=new Functions(this);
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
    String username;
    String password;
    int q1noplayed;
    double q1average;
    int q2noplayed;
    double q2average;
    
    public UI(){
        this.userdao= new UserDao(new User(username, password, q1noplayed, q1average, q2noplayed, q2average));
    }
    
    @Override
    public void start(Stage stage) throws SQLException, ClassNotFoundException{
        //eka login näyttö
        //this.userdao.resetH2();
        stage.setTitle("Opintopiiri Sovellus");
        
        //this.userdao.createConnection();
        //loginscene
        Label usernameText= new Label("Username:");
        TextField usernameField= new TextField();
        Label passwordText= new Label("Password:");
        PasswordField passwordField= new PasswordField();
        Button loginButton= new Button("Login");
        Button registerButton= new Button("Register");
        Label errorLabel= new Label("");
        
        GridPane login= new GridPane();
        login.setPrefSize(800, 500);
        login.setAlignment(Pos.CENTER);
        login.setVgap(25);
        login.setHgap(40);
        login.setPadding(new Insets(5,5,5,5));
        
        login.add(usernameText, 0, 0);
        login.add(usernameField, 1, 0);
        login.add(passwordText, 0, 1);
        login.add(passwordField, 1, 1);
        login.add(loginButton, 1, 2);
        login.add(registerButton, 1, 3);
        login.add(errorLabel, 1, 4);
        
        Scene loginScene= new Scene(login);
        stage.setScene(loginScene);
        
        //registerScene luodaan
        Label newUsernameText= new Label("New username:");
        TextField newUsernameField= new TextField();
        Label newPasswordText= new Label("New password:");
        PasswordField newPasswordField= new PasswordField();
        Button createNew= new Button("Create a new user");
        Button returnToLogin= new Button("Return to login screen");
        Label registerErrorLabel= new Label("");
        
        GridPane register = new GridPane();
        register.setPrefSize(800, 500);
        register.setAlignment(Pos.CENTER);
        register.setVgap(25);
        register.setHgap(40);
        register.setPadding(new Insets(5,5,5,5));
        
        register.add(newUsernameText, 0, 0);
        register.add(newUsernameField, 1, 0);
        register.add(newPasswordText, 0, 1);
        register.add(newPasswordField, 1, 1);
        register.add(createNew, 1, 2);
        register.add(returnToLogin, 1, 3);
        register.add(registerErrorLabel, 1,4);
        
        Scene registerScene= new Scene(register);

        //luodaan gamemenuScene
        Label gamemenutect= new Label("game menu scene");
        
        GridPane gamemenu= new GridPane();
        
        gamemenu.add(gamemenutect, 1, 0);
        
        Scene gamemenuScene= new Scene(gamemenu);
        
        //siirrytään loginista pelimenuun
        loginButton.setOnAction((event)->{
            try {
                username=usernameField.getText().trim();
                password=passwordField.getText().trim();
                if(!this.userdao.checkIfUserExists(username)){
                    errorLabel.setText("No user with this username was found");
                }else{
                    if(this.userdao.checkIfUsernameMatchesPassword(username, password)){  
                    stage.setScene(gamemenuScene);
                    }else{
                        errorLabel.setText("Username and password don't match");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        //siirrytään rekisteröitymiseen
        registerButton.setOnAction((event)->{
            stage.setScene(registerScene);
        });
        
        //siirrytään takaisin loginnäyttöön rekisteröitymisestä
        returnToLogin.setOnAction((event)->{
            stage.setScene(loginScene);
        });
        //luodaan uusi käyttäjä ja muokataan tekstiä TOIMII
        createNew.setOnAction((event)->{
            try {
                username=newUsernameField.getText().trim();
                password=newPasswordField.getText().trim();
                
                if(this.userdao.checkIfUserExists(username)){
                    registerErrorLabel.setText("This username is already taken");
                    
                }else{
                    //System.out.println("ei ole db uutta käyttäjää vielä");
                    this.userdao.addUser(new User(username, password, 0,0,0,0));
                    registerErrorLabel.setText("New user created!");
                }
                
            } catch (SQLException ex) {
                //System.out.println("sql ongelma create new nappi");
                Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        });
        
        
        //lopussa vaan show
        stage.show();
        
        
    }
    
    
    public static void main(String[] args){
        launch(args);
    }
}
