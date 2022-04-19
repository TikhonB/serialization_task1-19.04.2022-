import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        File dirSrc = new File("C:\\NetologyHW\\Сериализация\\Games\\src");
        File dirRes = new File("C:\\NetologyHW\\Сериализация\\Games\\res");
        File dirSave = new File("C:\\NetologyHW\\Сериализация\\Games\\savegames");
        File dirTemp = new File("C:\\NetologyHW\\Сериализация\\Games\\temp");
        File childMainSrc = new File(dirSrc, "main");
        File childTestSrc = new File(dirSrc, "test");
        File childDir3 = new File(dirTemp, "test.txt");
        File fileMain = new File("C:\\NetologyHW\\Сериализация\\Games\\src\\main\\Main.java");
        File fileUtils = new File("C:\\NetologyHW\\Сериализация\\Games\\src\\main\\Utils.java");
        File childDrawablesRes = new File(dirRes, "drawables");
        File childVectorsRes = new File(dirRes, "vectors");
        File childIconsRes = new File(dirRes, "icons");

        StringBuffer buffer = new StringBuffer();

        if (dirSrc.mkdir()) {
            String srcCreation = "Директория " + dirSrc.getName() + " создана \n"; // src
            buffer.append(srcCreation);
        }
        if (childMainSrc.mkdir()) {
            String mainCreation = "Директория " + childMainSrc.getName() + " создана\n"; // main
            buffer.append(mainCreation);
            try {
                if (fileMain.createNewFile()) {
                    String mainFileCreation = "Файл " + fileMain.getName() + " создан\n"; // main.java
                    buffer.append(mainFileCreation);
                }
                if (fileUtils.createNewFile()) {
                    String utilsFileCreation = "Файл " + fileUtils.getName() + " создан\n"; // utils.java
                    buffer.append(utilsFileCreation);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (dirRes.mkdir()) {
            String resCreation = "Директория " + dirRes.getName() + " создана\n"; // res
            buffer.append(resCreation);
            if (childDrawablesRes.mkdir()) {
                String drawablesCreation = "Директория " + childDrawablesRes.getName() + " создана\n"; // drawables
                buffer.append(drawablesCreation);
            }
            if (childVectorsRes.mkdir()) {
                String vectorsCreation = "Директория " + childVectorsRes.getName() + " создана\n"; // vectors
                buffer.append(vectorsCreation);
            }
            if (childIconsRes.mkdir()) {
                String iconsCreation = "Директория " + childIconsRes.getName() + " создана\n"; // icons
                buffer.append(iconsCreation);
            }
        }
        if (dirSave.mkdir()) {
            String saveCreation = "Директория " + dirSave.getName() + " создана\n"; // savegames
            buffer.append(saveCreation);
        }
        if (childTestSrc.mkdir()) {
            String testCreation = "Директория " + childTestSrc.getName() + " создана\n"; // test
            buffer.append(testCreation);
        }
        if (dirTemp.mkdir()) {
            String tempDirCreation = "Директория " + dirTemp.getName() + " создана\n"; //temp
            buffer.append(tempDirCreation);
        }
        try {
            if (childDir3.createNewFile()) {
                String tempFileCreation = "Файл " + childDir3.getName() + " создан\n"; // temp.txt
                buffer.append(tempFileCreation);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileWriter writer = new FileWriter("C:\\NetologyHW\\Сериализация\\Games\\temp\\test.txt")) { // запись в test.txt
            writer.write(buffer.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
