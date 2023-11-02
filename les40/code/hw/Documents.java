package hw;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/*Задача 1. На примере Photo - Album (по аналогии) разработать приложение
 для хранения документов в архиве Documents - Archive. Поля для документа:
        id папки
        id документа
        название
        url
        дата документа
        Архив должен позволять:

        добавить документ
        обновить документ
        получить документ по номеру документа и папки
        получить все документы из папки по ее номеру
        получить все документы с датами за период от и до
        узнать количество хранимых документов в архиве*/
public class Documents {
    private int folder;

    private int document;

    private String title;

    private String url;
  private LocalDate dataOfDocument;


    public Documents(int folder, int document, String title, String url, LocalDateTime dataOfDocument) {
        this.folder = folder;
        this.document = document;
        this.title = title;
        this.url = url;
        this.dataOfDocument = dataOfDocument;
    }

    public int getFolder() {
        return folder;
    }

    public void setFolder(int folder) {
        this.folder = folder;
    }

    public int getDocument() {
        return document;
    }

    public void setDocument(int document) {
        this.document = document;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDate getDataOfDocument() {
        return dataOfDocument;
    }

    public void setDataOfDocument(LocalDate dataOfDocument) {
        this.dataOfDocument = dataOfDocument;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Documents documents = (Documents) object;
        return folder == documents.folder && document == documents.document;
    }

    @Override
    public int hashCode() {
        return Objects.hash(folder, document);
    }

    @Override
    public String toString() {
        return "Documents{" +
                "folder=" + folder +
                ", document=" + document +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", dataOfDocument=" + dataOfDocument +
                '}';
    }
}
