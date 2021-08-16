package com.anazen.fishing

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions

class MapsFragment : Fragment() {


    private val callback = OnMapReadyCallback { googleMap ->

        val Belarus = LatLng(53.626574, 28.107063)
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Belarus,6f))
        val iconDesc = BitmapDescriptorFactory.fromResource(R.drawable.icon)

        val beloeBB = LatLng(51.818579, 23.707480)
        googleMap.addMarker(MarkerOptions().position(beloeBB).title("озеро БЕЛОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val lohozvaBB = LatLng(52.968244, 25.567992)
        googleMap.addMarker(MarkerOptions().position(lohozvaBB).title("река ЛОХОЗВА").icon(iconDesc).anchor(0.5f, 1f))

        val pavlinovoBB = LatLng(53.026175, 25.808273)
        googleMap.addMarker(MarkerOptions().position(pavlinovoBB).title("пруд ПАВЛИНОВО").icon(iconDesc).anchor(0.5f, 1f))

        val lesnayaBB = LatLng(52.376207, 23.755136)
        googleMap.addMarker(MarkerOptions().position(lesnayaBB).title("река ЛЕСНАЯ").icon(iconDesc).anchor(0.5f, 1f))

        val rogoznyanskoeBB = LatLng(51.825832, 23.725233)
        googleMap.addMarker(MarkerOptions().position(rogoznyanskoeBB).title("озеро РОГОЗНЯНСКОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val selyahiBB = LatLng(51.601747, 23.616473)
        googleMap.addMarker(MarkerOptions().position(selyahiBB).title("озеро СЕЛЯХИ").icon(iconDesc).anchor(0.5f, 1f))

        val stradechskoeBB = LatLng(51.880168, 23.745379)
        googleMap.addMarker(MarkerOptions().position(stradechskoeBB).title("озеро СТРАДЕЧСКОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val muhovetsBB = LatLng(52.091102, 23.833754)
        googleMap.addMarker(MarkerOptions().position(muhovetsBB).title("река МУХОВЕЦ").icon(iconDesc).anchor(0.5f, 1f))

        val chernoeBB = LatLng(51.811255, 23.708818)
        googleMap.addMarker(MarkerOptions().position(chernoeBB).title("озеро ЧЕРНОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val krasnoeBG = LatLng(52.659784, 26.493251)
        googleMap.addMarker(MarkerOptions().position(krasnoeBG).title("озеро КРАСНОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val drogichinBG = LatLng(52.200029, 25.163133)
        googleMap.addMarker(MarkerOptions().position(drogichinBG).title("водохранилище ДРОГИЧИНСКОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val vizzharBZH = LatLng(52.199036, 23.985257)
        googleMap.addMarker(MarkerOptions().position(vizzharBZH).title("водохранилище ВИЗЖАР").icon(iconDesc).anchor(0.5f, 1f))

        val zav = LatLng(51.997642, 25.694361)
        googleMap.addMarker(MarkerOptions().position(zav).title("озеро ЗАВИЩАНСКОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val vul = LatLng(52.538805, 25.866978)
        googleMap.addMarker(MarkerOptions().position(vul).title("озеро ВУЛЬКОВСКОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val beloeBL = LatLng(52.383216, 26.643635)
        googleMap.addMarker(MarkerOptions().position(beloeBL).title("озеро БЕЛОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val vulkaBL = LatLng(52.348841, 26.981778)
        googleMap.addMarker(MarkerOptions().position(vulkaBL).title("озеро ВУЛЬКА").icon(iconDesc).anchor(0.5f, 1f))

        val mik = LatLng(52.204473, 27.396184)
        googleMap.addMarker(MarkerOptions().position(mik).title("канал МИКАШЕВИЧСКИЙ").icon(iconDesc).anchor(0.5f, 1f))

        val vedma = LatLng(53.016306, 26.228888)
        googleMap.addMarker(MarkerOptions().position(vedma).title("река ВЕДЬМА").icon(iconDesc).anchor(0.5f, 1f))

        val velih = LatLng(51.717536, 24.272071)
        googleMap.addMarker(MarkerOptions().position(velih).title("озеро ВЕЛИХОВО").icon(iconDesc).anchor(0.5f, 1f))

        val vymno = LatLng(55.255361, 30.618401)
        googleMap.addMarker(MarkerOptions().position(vymno).title("озеро ВЫМНО-ТОДУЛИНО").icon(iconDesc).anchor(0.5f, 1f))

        val yankov = LatLng(55.292039, 30.662948)
        googleMap.addMarker(MarkerOptions().position(yankov).title("озеро ЯНОВИЧСКОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val sho = LatLng(55.180243, 28.211752)
        googleMap.addMarker(MarkerOptions().position(sho).title("озеро ШО").icon(iconDesc).anchor(0.5f, 1f))

        val kosho = LatLng(55.500130, 29.905941)
        googleMap.addMarker(MarkerOptions().position(kosho).title("озеро КОШО").icon(iconDesc).anchor(0.5f, 1f))

        val tiosto = LatLng(55.594533, 30.495471)
        googleMap.addMarker(MarkerOptions().position(tiosto).title("озеро ТИОСТО").icon(iconDesc).anchor(0.5f, 1f))

        val suya = LatLng(55.321311, 28.799876)
        googleMap.addMarker(MarkerOptions().position(suya).title("озеро СУЯ").icon(iconDesc).anchor(0.5f, 1f))

        val kriv = LatLng(55.165603, 29.013262)
        googleMap.addMarker(MarkerOptions().position(kriv).title("озеро КРИВОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val sozh = LatLng(52.560481, 31.157647)
        googleMap.addMarker(MarkerOptions().position(sozh).title("река СОЖ").icon(iconDesc).anchor(0.5f, 1f))

        val dnepr = LatLng(53.063283, 30.050053)
        googleMap.addMarker(MarkerOptions().position(dnepr).title("река ДНЕПР").icon(iconDesc).anchor(0.5f, 1f))

        val prip = LatLng(52.116890, 28.489051)
        googleMap.addMarker(MarkerOptions().position(prip).title("река ПРИПЯТЬ").icon(iconDesc).anchor(0.5f, 1f))

        val zhizhma = LatLng(54.126542, 25.340637)
        googleMap.addMarker(MarkerOptions().position(zhizhma).title("река ЖИЖМА").icon(iconDesc).anchor(0.5f, 1f))

        val yub = LatLng(53.640923, 23.747958)
        googleMap.addMarker(MarkerOptions().position(yub).title("озеро ЮБИЛЕЙНОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val gezg = LatLng(53.597303, 25.387916)
        googleMap.addMarker(MarkerOptions().position(gezg).title("водохранилище ГЕЗГАЛЬСКОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val vil = LatLng(54.484953, 27.095001)
        googleMap.addMarker(MarkerOptions().position(vil).title("водохранилище ВИЛЕЙСКОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val mins = LatLng(53.982528, 27.377407)
        googleMap.addMarker(MarkerOptions().position(mins).title("Водохранилище ЗАСЛАВСКОЕ (Минское море)").icon(iconDesc).anchor(0.5f, 1f))

        val cn = LatLng(53.957091, 27.579455)
        googleMap.addMarker(MarkerOptions().position(cn).title("Водохранилище ЦНЯНСКОЕ").icon(iconDesc).anchor(0.5f, 1f))

        val chig = LatLng(53.476879, 29.835351)
        googleMap.addMarker(MarkerOptions().position(chig).title("Водохранилище ЧИГИРИНСКОЕ").icon(iconDesc).anchor(0.5f, 1f))


//        val glubokoeVP = PolylineOptions()
//        glubokoeVP.color(Color.RED)
//        glubokoeVP.width(3f)
//            .add(LatLng(55.698181, 29.453358))
//            .add(LatLng(55.697966, 29.453228))
//            .add(LatLng(55.697869, 29.452735))
//            .add(LatLng(55.697688, 29.452287))
//            .add(LatLng(55.697942, 29.451427))
//            .add(LatLng(55.697965, 29.450399))
//            .add(LatLng(55.698026, 29.449346))
//            .add(LatLng(55.697869, 29.448659))
//            .add(LatLng(55.697978, 29.447672))
//            .add(LatLng(55.697700, 29.446449))
//            .add(LatLng(55.697132, 29.446041))
//            .add(LatLng(55.696563, 29.446086))
//            .add(LatLng(55.696274, 29.446684))
//            .add(LatLng(55.695923, 29.447027))
//            .add(LatLng(55.695463, 29.447153))
//            .add(LatLng(55.695027, 29.446812))
//            .add(LatLng(55.694713, 29.446171))
//            .add(LatLng(55.694351, 29.445825))
//            .add(LatLng(55.694194, 29.446321))
//            .add(LatLng(55.693926, 29.446728))
//            .add(LatLng(55.693212, 29.446770))
//            .add(LatLng(55.692691, 29.446665))
//            .add(LatLng(55.692379, 29.446404))
//            .add(LatLng(55.692076, 29.446535))
//            .add(LatLng(55.691968, 29.447350))
//            .add(LatLng(55.691982, 29.448206))
//            .add(LatLng(55.692281, 29.448595))
//            .add(LatLng(55.692379, 29.450137))
//            .add(LatLng(55.692693, 29.451962))
//            .add(LatLng(55.693372, 29.453228))
//            .add(LatLng(55.693348, 29.454711))
//            .add(LatLng(55.693406, 29.455611))
//            .add(LatLng(55.693285, 29.455869))
//            .add(LatLng(55.693153, 29.455823))
//            .add(LatLng(55.692778, 29.454754))
//            .add(LatLng(55.692657, 29.453914))
//            .add(LatLng(55.692406, 29.453581))
//            .add(LatLng(55.692025, 29.453560))
//            .add(LatLng(55.691675, 29.454102))
//            .add(LatLng(55.691306, 29.454442))
//            .add(LatLng(55.691161, 29.454131))
//            .add(LatLng(55.690847, 29.453847))
//            .add(LatLng(55.690526, 29.454196))
//            .add(LatLng(55.690490, 29.455323))
//            .add(LatLng(55.690702, 29.456310))
//            .add(LatLng(55.691222, 29.456868))
//            .add(LatLng(55.691869, 29.457211))
//            .add(LatLng(55.692637, 29.458912))
//            .add(LatLng(55.693009, 29.458955))
//            .add(LatLng(55.693372, 29.458698))
//            .add(LatLng(55.693590, 29.458113))
//            .add(LatLng(55.693904, 29.457689))
//            .add(LatLng(55.694594, 29.457582))
//            .add(LatLng(55.695754, 29.456601))
//            .add(LatLng(55.695708, 29.455842))
//            .add(LatLng(55.696522, 29.454959))
//            .add(LatLng(55.697223, 29.454766))
//            .add(LatLng(55.697991, 29.453972))
//            .add(LatLng(55.698181, 29.453358))
//
//        googleMap.addPolyline(glubokoeVP)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_maps, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)

    }
}