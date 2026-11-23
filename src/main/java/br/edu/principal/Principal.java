package br.edu.principal;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Principal extends Application {

    private Usuario usuarioAdmin = new Usuario("admin", "1234");

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sistema de Login");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        Label lblUsuario = new Label("Usuário:");
        grid.add(lblUsuario, 0, 0);

        TextField txtUsuario = new TextField();
        grid.add(txtUsuario, 1, 0);

        Label lblSenha = new Label("Senha:");
        grid.add(lblSenha, 0, 1);

        PasswordField txtSenha = new PasswordField();
        grid.add(txtSenha, 1, 1);

        Button btnEntrar = new Button("Entrar");
        grid.add(btnEntrar, 1, 2);

        Label lblMensagem = new Label();
        grid.add(lblMensagem, 1, 3);

        btnEntrar.setOnAction(e -> {
            String digitadoU = txtUsuario.getText();
            String digitadoS = txtSenha.getText();

            if (usuarioAdmin.validar(digitadoU, digitadoS)) {
                lblMensagem.setText("Login realizado com sucesso!");
            } else {
                lblMensagem.setText("Usuário ou senha inválidos!");
            }
        });

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}