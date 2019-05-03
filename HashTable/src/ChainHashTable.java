
public class ChainHashTable {
    LinkedList[] hashTable;
    int size;

    public ChainHashTable(int s){
        this.size = s;
        hashTable = new LinkedList[size];
        for (int i=0; i<size; i++){
            hashTable[i] = new LinkedList();
        }
    }

    public void displayTable(){
        for (int j=0; j<size; j++){
            System.out.print(j + ". ");
            hashTable[j].displayList();
        }
    }

    public int hashFunk(int key){
        return key%size;
    }

    public void insert(Link theLink){
        int key = theLink.getiData();
        int hashVal = hashFunk(key);
        hashTable[hashVal].insert(theLink);
    }

    public void delete(int key){
        int hashVal = hashFunk(key);
        hashTable[hashVal].delete(key);
    }

    public Link find(int key){
        int hashVal = hashFunk(key);
        return hashTable[hashVal].find(key);
    }
}
