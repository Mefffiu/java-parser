import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataWriter {
    private final Logger log = LoggerFactory.getLogger(getClass());

    private String outputFilePath;

    public DataWriter(String outputFilePath) {
        this.outputFilePath = outputFilePath;
        writeDataHeader();
    }

    private void writeDataHeader() {
        // clear the existing file content and write data header
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath, false))) {
            writer.append("label,context,code_fragment");
        } catch (IOException e) {
            log.warn("Cannot write data to '" + outputFilePath + "'");
        }
    }

    public void writeData(List<DataRow> dataRows) {
        log.info("Saving structures...");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath, true))) {
            for (DataRow dataRow : dataRows) {
                writer.newLine();
                writer.append(dataRow.toCSVFormat());
            }
        } catch (IOException e) {
            log.warn("Cannot write data to '" + outputFilePath + "'");
        }
    }

}
