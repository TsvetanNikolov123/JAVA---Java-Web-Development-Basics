package javache.database.repositories;

public abstract class EntityRepository<T> {
    private String collectionName;

    protected EntityRepository(String collectionName) {
        this.setCollectionName(collectionName);
    }

    public String getCollectionName() {
        return this.collectionName;
    }

    private void setCollectionName(String collectionName) {

    }

    public boolean save(T t) {
        //this.csvFileWriter.write(t.toString());
        return false;
    }

    public T[] findAll() {
        // abstract
        // reflection
        // this.csvFileReader.readFile(this.collectionName + ".scv") <- MAKE THIS CONSTANT;

        return (T[]) (new Object[0]);
    }
}
