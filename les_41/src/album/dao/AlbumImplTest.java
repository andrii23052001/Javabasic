package album.dao;

import album.dao.model.Photo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;


class AlbumImplTest {


    Album album;
    LocalDateTime now= LocalDateTime.now();

    Photo[]ph;

    @org.junit.jupiter.api.BeforeEach
     void setUp() {
        album=new AlbumImpl(7);
        ph = new Photo[6];
        ph[0]= new Photo(1,1,"t1","url1",now.minusDays(2));//=сделали фото 7 дней назад
        ph[1]= new Photo(1,2,"t2","url2",now.minusDays(3));//=сделали фото 7 дней назад
        ph[2]= new Photo(1,3,"t3","url4",now.minusDays(5));//=сделали фото 7 дней назад
        ph[3]= new Photo(2,1,"t1","url4",now.minusDays(7));//=сделали фото 7 дней назад
        ph[4]= new Photo(2,2,"t2","url5",now.minusDays(7));//=сделали фото 7 дней назад
        ph[5]= new Photo(2,3,"t3","url6",now.minusDays(7));//=сделали фото 7 дней назад

        //не забыть положить эти ph в альбом методом AddPhoto

    }

    @org.junit.jupiter.api.Test
    void addPhoto() {
        //нельзя добавить null
        assertFalse(album.addPhoto(null));
        //нельзя добавить имеющееся
        assertFalse(album.addPhoto(ph[1]));
        //проверить возможность добавления
        Photo photo = new Photo(3,1,"t","url", now);
        assertTrue(album.addPhoto(photo));
        //проверить ожидаемое кол-во после добавления
        assertEquals(7,album.size());
        //нельзя превысить capacity
        photo = new Photo(3,2, "t", "url",now);
        assertFalse(album.addPhoto(photo));
    }

    @org.junit.jupiter.api.Test
    void removePhoto() {
        //удаление фото
        assertTrue(album.removePhoto(1,3));//удалили ph[2]
        //удаление отсутствующего фото
        assertFalse(album.removePhoto(5,1));//такого фото нет в альбоме
        //проверка кол-ва
        assertEquals(5,album.size());//сейчас 5 фото сравниваем с size
        //не найдем удаленное фото
        assertNull(album.getPhotoFromAlbum(3,1));
    }

    @org.junit.jupiter.api.Test
    void updatePhoto() {
        assertTrue(album.updatePhoto(1,1,"newUrl"));
        assertEquals("newUrl",album.getPhotoFromAlbum(1,1).getUrl());//проверили , что обновился url
    }

    @org.junit.jupiter.api.Test
    void getPhotoFromAlbum() {
        assertEquals(ph[0],album.getPhotoFromAlbum(1,1));// проверяем нахождение фото
        assertNull(album.getPhotoFromAlbum(1,3));//ищем несуществующие фото
    }

    @org.junit.jupiter.api.Test
    void getAllPhotoFromAlbum() {
        //этот метод возвращает массив фото
        Photo[] expected = {ph[3],ph[4],ph[5]};// это фото из albumid -2
        Photo[] actual =album.getAllPhotoFromAlbum(2);//выбрали альбомId -2
        Arrays.sort(actual);//сортируем массив
        assertArrayEquals(expected,actual);

    }

    @org.junit.jupiter.api.Test
    void getPhotoBetweenDate() {
        LocalDate ld = now.toLocalDate();//оставляем дату и убираем время
        Photo[]actual=album.getPhotoBetweenDate(ld.minusDays(1),ld.minusDays(6));
        Arrays.sort(actual);
        Photo[]expected ={ph[0],ph[1],ph[2]};
    }

    @org.junit.jupiter.api.Test
    void size() {

    }

    }