package org.example;

public class InputParser {
    private String directoryPath;
    private String typeValue;
    private String startTimeValue;
    private String endTimeValue;
    private String outputFileType;
    private String outputFileName;

    public  InputParser(String[] args) {
        outputFileType = "json";
        outputFileName = "out";

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-d":
                case "--directory":
                    directoryPath = args[++i];
                    System.out.println(directoryPath);
                    break;
                case "-t":
                case "--type":
                    typeValue = args[++i];
                    break;
                case "--startTime":
                    startTimeValue = args[++i];
                    break;
                case "--endTime":
                    endTimeValue = args[++i];
                    break;
                case "--outputFileType":
                    outputFileType = args[++i];
                    break;
                case "--outputFileName":
                    outputFileName = args[++i];
                    break;
                default:
                    System.out.println("Invalid argument: " + args[i]);
                    break;
            }
        }

        if (directoryPath.isEmpty() || typeValue.isEmpty() || startTimeValue.isEmpty() || endTimeValue.isEmpty()) {
            System.out.println("directory, type, startTime, and endTime are required arguments");
        }

        if (!outputFileType.equals("json") && !outputFileType.equals("yaml")) {
            System.out.println("Invalid output file type. Supported types are json and yaml");
        }

        if (outputFileType.equals("json")) {
            outputFileName += ".json";
        } else {
            outputFileName += ".yaml";
        }
    }

    public String getDirectoryPath() {
        return directoryPath;
    }

    public String getTypeValue() {
        return typeValue;
    }

    public String getStartTimeValue() {
        return startTimeValue;
    }

    public String getEndTimeValue() {
        return endTimeValue;
    }

    public String getOutputFileType() {
        return outputFileType;
    }

    public String getOutputFileName() {
        return outputFileName;
    }
}
