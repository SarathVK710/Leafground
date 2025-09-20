package javaclass;

public class BookingCalculation {

        public static void main(String[] args) {

            int userBookingdates = 6;
            String dayPrice = "$100";
            String weeklyDiscount = "10%";
            String DeliveryFee = "";
            String ServiceFee = "";

            String stringDayPrice = dayPrice.replace("$", "").replace(",", "");
            int DayPrice = Integer.parseInt(stringDayPrice);
            int subTotal = userBookingdates * DayPrice;
            System.out.println("TotaldayPrice = " +subTotal);



                if (weeklyDiscount != null) {
                    try {
                        String stringWeeklyDiscountPrice = weeklyDiscount.replace("%", "");
                        int intWeeklyDiscountPrice = Integer.parseInt(stringWeeklyDiscountPrice);
                        int WeeklyDiscountPrice = (intWeeklyDiscountPrice * subTotal) / 100;
                        subTotal -= WeeklyDiscountPrice;
                        System.out.println("WeeklyDiscountPrice = -" + WeeklyDiscountPrice);
                    } catch (NumberFormatException a) {
                        System.out.println("Weekly Discount is not provided");
                    }
                }

            if (DeliveryFee != null) {
                try {
                    String stringDeliveryFees = DeliveryFee.replace("$", "").replace(",", "");
                    int DeliveryFees = Integer.parseInt(stringDeliveryFees);
                    subTotal += DeliveryFees;
                    System.out.println("DeliveryFees = " + DeliveryFees);
                }catch (NumberFormatException a){
                    System.out.println("User Delivery Fee is not selected");
                }
            }

            String StringServiceFee = ServiceFee.replace("%", "");
            int intServiceFee = Integer.parseInt(StringServiceFee);
            int serviceFee = (intServiceFee * subTotal) / 100;
            subTotal += serviceFee;
            System.out.println("serviceFee = " +serviceFee);
            System.out.println("Total Amount = " +subTotal);
        }

    }
