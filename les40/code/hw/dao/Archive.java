package hw.dao;


import hw.Documents;

import java.time.LocalDate;

//  добавить документ
        //        обновить документ
          //      получить документ по номеру документа и папки
            //    получить все документы из папки по ее номеру
              //  получить все документы с датами за период от и до
                //узнать количество хранимых документов в архиве*/
public interface Archive {

    boolean  addDocument(Documents documents);

    boolean updatePhoto(int document, int folder,String url);

    Documents getDocument(int document,int folder);

    Documents[] getAllDocuments (int folder);

    Documents[] getAllDocumentsBetweenDate(LocalDate dateFrom,LocalDate dateTo);


    int size(); // quantity



}
