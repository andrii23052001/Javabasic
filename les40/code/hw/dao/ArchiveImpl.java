package hw.dao;

import hw.Documents;

import java.time.LocalDate;

public class ArchiveImpl implements  Archive {


    Documents[] documents;

    private int size;
    public ArchiveImpl(int capacity){
        documents=new Documents[capacity];
    }

    @Override
    public boolean addDocument(Documents documents) {
        return false;
    }

    @Override
    public boolean updatePhoto(int document, int folder, String url) {
        return false;
    }

    @Override
    public Documents getDocument(int document, int folder) {
        return null;
    }

    @Override
    public Documents[] getAllDocuments(int folder) {
        return new Documents[0];
    }

    @Override
    public Documents[] getAllDocumentsBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Documents[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
