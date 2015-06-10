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
public class IncidenciasEnCurso extends Fragment{

    /**
     * Returns a new instance of this fragment for the given section number.
     */
    public static IncidenciasEnCurso newInstance() {
        IncidenciasEnCurso fragment = new IncidenciasEnCurso();
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lay_incidencia_en_curso, container, false);
        return rootView;
    }

}
