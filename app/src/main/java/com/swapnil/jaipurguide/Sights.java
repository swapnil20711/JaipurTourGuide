package com.swapnil.jaipurguide;

import androidx.fragment.app.Fragment;

import java.util.List;

public class Sights extends Fragment {
    public static void initSightsList(List<Location> list) {
        list.add(new Location(500, "Amer fort", "Amber Fort, situated 11 kms from Jaipur, is a fort built with great artistic taste. Cradled on the top of a hill forming a beautiful reflection in Maotha Lake, it is popularly known as Amer Fort.", "Devisinghpura, Amer, Jaipur, Rajasthan 302001", "8am–5:30pm", " +91-141-2530293", R.drawable.amer));
        list.add(new Location(200, "Nahargarh fort", "Nahargarh Fort stands on the edge of the Aravalli Hills, overlooking the city of Jaipur in the Indian state of Rajasthan. Along with Amer Fort and Jaigarh Fort, Nahargarh once formed a strong defense ring for the city", "Krishna Nagar, Brahampuri, Jaipur, Rajasthan 302002", "10am–6pm", "+91-141-5134038", R.drawable.place2));
        list.add(new Location(100, "Jaigarh fort", "Jaigarh Fort is situated on the promontory called the Cheel ka Teela of the Aravalli range; it overlooks the Amer Fort and the Maota Lake, near Amer in Jaipur, Rajasthan, India. The fort was built by Jai Singh II in 1726 to protect the Amer Fort and its palace complex and was named after him.", "Devisinghpura, Amer, Rajasthan 302028", "9:30am–4:45pm", "+91-141-5110598", R.drawable.jaigarh));
        list.add(new Location(200, "Hawa Mahal", "Hawa Mahal is a palace in Jaipur, India. Made with the red and pink sandstone, the palace sits on the edge of the City Palace, Jaipur, and extends to the Zenana, or women's chambers. The structure was built in 1799 by Maharaja Sawai Pratap Singh, the grandson of Maharaja Sawai Jai Singh, who was the founder of Jaipur.", "Hawa Mahal Rd, Badi Choupad, J.D.A. Market, Pink City, Jaipur, Rajasthan 302002", "9am–5pm", "+91-141-2618862", R.drawable.hawamahal));
    }
}
