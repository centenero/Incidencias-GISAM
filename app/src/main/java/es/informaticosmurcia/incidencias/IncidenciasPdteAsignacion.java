package es.informaticosmurcia.incidencias;

//import android.app.Fragment; lo sutituyo por android.support.v4.app.Fragment
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by W7 on 10/06/2015.
 */
public class IncidenciasPdteAsignacion extends Fragment {


    /**
     * Returns a new instance of this fragment for the given section number.
     */
    public static IncidenciasPdteAsignacion newInstance() {
        IncidenciasPdteAsignacion fragment = new IncidenciasPdteAsignacion();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lay_incidencia_pdte_asignacion, container, false);
        return rootView;
    }
}
