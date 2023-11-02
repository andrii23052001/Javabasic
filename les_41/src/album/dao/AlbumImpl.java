package album.dao;

import album.dao.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album {

    static Comparator<Photo> comparator = (p1, p2) ->{
        int res = p1.getDate().compareTo(p2.getDate()); //date field
        return res !=0  ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());//potoId field
    };
    //fields
    private Photo[] photos;
    private int size;

    //constructor
    public AlbumImpl(int capacity){
        photos = new Photo[capacity]; //новый массив размером {capacity
    }

    @Override
    public boolean addPhoto(Photo photo) {
        if (photo == null || size == photos.length || getPhotoFromAlbum(photo.getPhotoId(),
                photo.getAlbumId()) != null) {
            return false;
        }
        //ищем индекс, куда вставить
        int index = Arrays.binarySearch(photos, 0, size, photo,comparator);
        //обработка индекса
        index = index >= 0 ? index : -index -1;
        //раздвигаем массив с индекса на 1 место вправо
        System.arraycopy(photos, index,photos,index +1,size -index);
        photos[index] = photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int photoId, int albumId) {
        //ищем фото
        for (int i = 0; i < size; i++) {
            if (photos[i].getPhotoId() == photoId && photos[i].getAlbumId() == albumId){
                //надгаем массив на найденную позицию i удаляемого фото
                System.arraycopy(photos, i + 1,photos,i,size -1 -i);
                //size--;
                photos[--size]=null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int photoId, int albumId, String url) {
        //найти фото
        Photo photo = getPhotoFromAlbum(photoId, albumId);
        if (photo == null) {
            return false;
        }
        photo.setUrl(url);//нашли фото, обновили url
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int photoId, int albumId) {
        //определили объект с которым сравниваем
        Photo pattern = new Photo(albumId,photoId,null,null,null);
        for (int i = 0; i < size; i++) {
            if (pattern.equals(photos[i])){
                return photos[i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId) {
        return findByPredicate (p->p.getAlbumid=albumId);
    }

    private Photo[]findByPredicate(Predicate<Photo>predicate){
        Photo[]res = new Photo[size];
        int j =0; //это у нас счетчик найденых фото в альбоме
        for (int i = 0; i < ; i++) {
            
        }
    }
    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return new Photo[0];
    }

    @Override
    public int size() {
        return size;
    }
}