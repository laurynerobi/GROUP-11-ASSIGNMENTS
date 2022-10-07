public class GetPriceFactory { //generate object of concrete classes
    public Price getPrice(String productType){
        if(productType == null){
            return null;
        }
        if(productType.equalsIgnoreCase("BananaPrice")){
            return new BananaPrice();
        }
        if(productType.equalsIgnoreCase("ApplesPrice")){
            return new ApplesPrice();
        }
        return null;
    }
}
