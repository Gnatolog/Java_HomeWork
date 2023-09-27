package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Класс сохранения полученных данных в файле
 */
public class SaveFiles {

    // region public Method
    /**
     * Мето формата сохранения данных в файле
     */
    private void save_directory(){
        try(FileWriter writ = new FileWriter(this.user.getSurname()+".txt",true)){
            writ.write("Surname: " + this.user.getSurname() + " |" );
            writ.write("Name: " + this.user.getName() +" |");
            writ.write("Middle name: " + this.user.getPatr() + " |");
            writ.write("Birthday: " + this.user.getBirthday() + " |");
            writ.write("Telephone number: " + String.valueOf(this.user.getTelnumber()) +" |");
            writ.write("Sex: " + this.user.getSex() + "\n");
        }catch (IOException e){
            System.out.println("Ошибка записи");
        }
    }

    /**
     * Метод создания файлов и  запуска инициализации созранения
     */
    public void save_files() {
        if(Files.isRegularFile(Path.of(this.user.getSurname()+".txt"))){    // Проверяем на наличие файла
                                                                                // соответсвующего фамилии пользователя
            save_directory();
        }else {
            try {
                Files.createFile(Path.of(this.user.getSurname()+".txt"));  // Создаеём файл с именем равного
                                                                               // фамилей пользователя
                save_directory();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    //endregion

    //region Constructor
    public SaveFiles(User user) {
        this.user = user;
    }
    //endregion

    //region Files
    User user;
    //endregion

}
