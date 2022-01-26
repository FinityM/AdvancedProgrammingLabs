public class FavouriteAnimal extends AlbumItem {
    FavouriteAnimal(String image, String desc) {
        super(image, desc);
    }

    @Override
    public String getImage() {
        return this.image;

    }

    @Override
    public String getDesc() {
        return this.desc;

    }
}
