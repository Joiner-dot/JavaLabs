import ru.itmo.exceptions.CatalogLoadException;
import ru.itmo.exceptions.ItemAlreadyExistsException;

import java.io.*;
import java.util.List;

public class InputCod {
    public String Input(String filename, String code) throws IOException {
        File f = new File(filename);

        try (FileInputStream fStream = new FileInputStream(filename)) { //файл закроется после окончания работы метода
            var iReader = new InputStreamReader(fStream, code); //кодировка

            StringBuilder resultStringBuilder = new StringBuilder();
            try (BufferedReader br
                         = new BufferedReader(new InputStreamReader(fStream))) {
                String line;
                while ((line = br.readLine()) != null) {
                    resultStringBuilder.append(line).append("\n");
                }
            }
            String result = resultStringBuilder.toString();
            return result;
        }
    }
}

