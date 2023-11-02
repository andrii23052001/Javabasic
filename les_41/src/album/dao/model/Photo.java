package album.dao.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Photo implements Comparable <Photo>{

    private int albumId;
    private int photoId;

    private String title;

    private String url;

    private LocalDateTime date;


    // конструктор


    public Photo(int albumId, int photoId, String title, String url, LocalDateTime date) {
        this.albumId = albumId;
        this.photoId = photoId;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    public int getAlbumId() {
        return albumId;
    }

    public int getPhotoId() {
        return photoId;
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

    public LocalDateTime getDate() {
        return date;
    }




    @Override
    public String toString() {
        return "Photo{" +
                "albumId=" + albumId +
                ", photoId=" + photoId +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Photo photo = (Photo) object;
        return albumId == photo.albumId && photoId == photo.photoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, photoId);
    }


    @Override
    public int compareTo(Photo o) {
        //нужно определить как сортировать обьекьекты в массиве Photo по двум полям albumId and photo id
        int res=Integer.compare(albumId,o.albumId);
        return res !=0 ? res: Integer.compare(photoId,o.photoId);//тернарный оператор

        //if(res!=0){return res} else{return Integer.compare(photoId,o.photoId)} - возможно и так

    }
}
