package hw.dao;

import hw.Documents;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class ArchiveImplTest {
    
    Archive[]archives;

    LocalDateTime now= LocalDateTime.now();
    
    Documents[]doc;

    @BeforeEach
    void setUp() {
        archives= new ArchiveImpl[]{new ArchiveImpl(5)};
        doc=new Documents[5];
        doc[0]=new Documents(1,1,"d1","url1",now.minusDays(6));
        doc[1]=new Documents(1,2,"d2","url2",now.minusDays(2));
        doc[2]=new Documents(2,1,"d1","url3",now.minusDays(62));
        
    }

    @Test
    void addDocument() {

        
    }

    @Test
    void updatePhoto() {
    }

    @Test
    void getDocument() {
    }

    @Test
    void getAllDocuments() {
    }

    @Test
    void getAllDocumentsBetweenDate() {
    }

    @Test
    void size() {
    }
}