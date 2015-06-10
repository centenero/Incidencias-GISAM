package es.informaticosmurcia.incidencias;

//import android.app.Fragment; lo sutituyo por android.support.v4.app.Fragment
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

/**
 * Created by W7 on 10/06/2015.
 */
public class IncidenciaDesestimada extends Fragment {

    private ListView listView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lay_incidencia_desestimada, container, false);


        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}
