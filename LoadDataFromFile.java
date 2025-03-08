package assignment2;

public void loadDataFromFile(String filename) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = br.readLine()) != null) {
        String[] parts = line.split(",");
        insert(new Book(parts[0], parts[1], Integer.parseInt(parts[2])));
    }
    br.close();
}