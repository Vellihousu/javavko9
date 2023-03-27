package veikko.vanninen.userprogram;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder{
    TextView userFirstName, userLastName, userEmail, userDegreeProgram;


    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        userFirstName = itemView.findViewById(R.id.txtUserFirstName);
        userLastName = itemView.findViewById(R.id.txtUserLastName);
        userEmail = itemView.findViewById(R.id.txtUserEmail);
        userDegreeProgram = itemView.findViewById(R.id.txtUserDegreeProgram);
    }

}
