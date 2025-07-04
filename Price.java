public class Price {
    public static void main(String[] args) {
        double originalPrice = 250.75;
        double discountRate = 0.15;
        double discountAmount = originalPrice*discountRate;
        double finalPrice = originalPrice-discountAmount;
        int wholeFinalPrice = (int) finalPrice;
        boolean isAffordable;
        if (wholeFinalPrice <= 220)
        {
          isAffordable=true;
        }
        else
        {
          isAffordable=false;
        }

        System.out.println("OriginalPrice: " + originalPrice);
        System.out.println("DiscountAmount: " + discountAmount);
        System.out.println("WholeFinalPrice: " + wholeFinalPrice);
        System.out.println("IsAffordable: " + isAffordable);

    }
    
}


/* output

OriginalPrice: 250.75
DiscountAmount: 37.6125
WholeFinalPrice: 213
IsAffordable: true

*/