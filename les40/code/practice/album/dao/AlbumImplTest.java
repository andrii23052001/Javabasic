package practice.album.dao;

import practice.album.model.Photo;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;



class AlbumImplTest {


    Album album;
    LocalDateTime now= LocalDateTime.now();

    Photo[]ph;

    @org.junit.jupiter.api.BeforeEach
     void setUp() {
        album=new AlbumImpl(7);
        ph = new Photo[6];
        ph[0]= new Photo(1,1,"t1","url1",now.minusDays(7));//=сделали фото 7 дней назад
        ph[1]= new Photo(1,2,"t2","url2",now.minusDays(7));//=сделали фото 7 дней назад
        ph[2]= new Photo(1,3,"t3","url4",now.minusDays(5));//=сделали фото 7 дней назад
        ph[3]= new Photo(2,1,"t1","url4",now.minusDays(7));//=сделали фото 7 дней назад
        ph[4]= new Photo(2,2,"t2","url5",now.minusDays(7));//=сделали фото 7 дней назад
        ph[5]= new Photo(2,3,"t3","url6",now.minusDays(7));//=сделали фото 7 дней назад

        //не забыть положить эти ph в альбом методом AddPhoto

    }

    @org.junit.jupiter.api.Test
    void addPhoto() {
      assertFalse (album.addPhoto(null));
        //нельзя добавить null
        assertFalse(album.addPhoto(ph[1]));
        //нельзя добавить имеющеейся
        Photo photo= new Photo(3,1,"t","url",now);
        // проверить возможность добавления
        // проверить ожидаемое кол-во после добавления
        // нельзя превысить capacity

    }

    @org.junit.jupiter.api.Test
    void removePhoto() {
    }

    @org.junit.jupiter.api.Test
    void updatePhoto() {
    }

    @org.junit.jupiter.api.Test
    void getPhotoFromAlbum() {
    }

    @org.junit.jupiter.api.Test
    void getAllPhotoFromAlbum() {
    }

    @org.junit.jupiter.api.Test
    void getPhotoBetweenDate() {
    }

    @org.junit.jupiter.api.Test
    void size() {

    }

    }