        PasswordField pwTxtFld = new PasswordField();
        String[] corUser = {"Daniel", "Michael", "Green"};
        String[] corPass = {"First", "Second", "Third"};
        String[] accType = {"Good", "Better", "Best"};
        
        submitBtn.setOnAction(new EventHandler<ActionEvent>() {
            String inputUser = "";
            String inputPass = "";
            String inputAcc = "";
            boolean auth = false;
            int userIndex = 0;
           
            @Override
            public void handle(ActionEvent event) {
                inputUser = userNameTxtFld.getText();
                inputPass = pwTxtFld.getText();
                
                while(tries<3){
                    if(inputUser.equals(corUser[userIndex]) && inputPass.equals(corPass[userIndex])){
                        do {
                            inputAcc = (String) JOptionPane.showInputDialog(null, "Please select your account type", null, JOptionPane.QUESTION_MESSAGE, null, accType, accType[0]);
                            tries++;
                        }while(!inputAcc.equals(accType[userIndex]) && tries<3);
                        while (inputAcc.equals(accType[userIndex]) && auth==false){
                            JOptionPane.showMessageDialog(null, "Welcome " + inputUser + "!");
                            auth = true;
                            System.exit(0);
                        }
                        while (tries>=3){
                            JOptionPane.showMessageDialog(null, "CONTACT ADMINISTRATOR!");
                            break;
                        }
                    }else if((!inputUser.equals(corUser[userIndex]) || !inputPass.equals(corPass[userIndex])) && userIndex<2){
                        userIndex++;
                    }else {
                        JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
                        inputUser = userNameTxtFld.getText();
                        inputPass = pwTxtFld.getText();
                        userIndex = 0;
                        tries++;
                        break;
                    }
                }
                
                while(tries>=3){
                    JOptionPane.showMessageDialog(null, "CONTACT ADMINISTRATOR!");
                    System.exit(0);
                }
            }
        });
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(10);
        grid.setHgap(10);
        grid.add(userNameLbl,0,0);
        grid.add(passwordLbl,0,1);
        grid.add(userNameTxtFld,1,0);
        grid.add(pwTxtFld,1,1);
        grid.add(submitBtn,1,2);
        
        Scene scene = new Scene(grid, 300, 300);
        
        primaryStage.setTitle("Authentication");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

}
