public abstract class AlbumItem {
    String image;
    String desc;

    AlbumItem(String image, String desc) {
        this.image = image;
        this.desc = desc;
    }

    public abstract String getImage();

    public abstract String getDesc();


}
