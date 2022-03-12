public class Database {
    private String[] colNames;
    private int numRows;
    private String[][] data;

    public String[] getColNames() {
        return colNames;
    }

    public void setColNames(String[] colNames) {
        this.colNames = colNames;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public Database(String contents) {
        String[] content  = contents.split("\\n");
        this.colNames = content[0].split(",");
        this.numRows = content.length - 1;
        this.data = new String[content.length - 1][this.colNames.length];
        for(int i = 0; i < content.length - 1; i++){
            this.data[i] = content[i + 1].split(",");

        }

    }

    public String getValue(String columnName,int row){
       int col = 0;
       for(int i = 0; i < colNames.length; i++){
           if(colNames[i].equals(columnName))
               col = i;

       }
       return this.data[row][col];
    }

}


