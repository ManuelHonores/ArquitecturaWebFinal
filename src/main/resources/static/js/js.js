"use strict";

// Agregar un viaje por Formulario

let formViaje = document.getElementById("agregarViaje");
if (formViaje != null) {
    formViaje.addEventListener("submit", addViaje);
}

function addViaje() {
    let viaje = {
        name: document.getElementById("nombreViaje").value,
        destinity_city: document.getElementById("ciudadDestino").value,
        continent: document.getElementById("continenteDestino").value,
        start_date: document.getElementById("fechaInicio").value,
        end_date: document.getElementById("fechaFin").value,
        description: document.getElementById("descripcion").value,
    }
    fetch('travels/', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(viaje)
    })
    .then(response => {
        getViajes();
    })
    .catch(error => console.log(error));
}

function addVuelo() {
    let vuelo = {
        company: document.getElementById("...").value,
        departure_date: document.getElementById("...").value,
        departure_hour: document.getElementById("...").value,
        departure_airport: document.getElementById("...").value,
        return_date: document.getElementById("...").value,
        return_hour: document.getElementById("...").value,
        return_airport: document.getElementById("...").value,
        reserve_code: document.getElementById("...").value,
        info_airplane: document.getElementById("...").value,
        scale_time: document.getElementById("...").value,
    }
    fetch('flies/', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(vuelo)
    })
        .then(response => {
            getVuelos();
        })
        .catch(error => console.log(error));
}

// Obtener viajes, tanto los futuros como los realizados.

function getViajes() {
    let tablaFuturos = document.getElementById("viajesFuturos");
    let filTablaF = tablaFuturos.rows.length; //la cantidad de filas de la tabla generada, con id="viajesFuturos"
    
    let tablaRealizados = document.getElementById("viajesRealizados");
    let filTablaR = tablaRealizados.rows.length;

    for (let i = 1; i < filTablaF; i++) {
        tablaFuturos.deleteRow(filTablaF - i);
    }

    for (let i = 1; i < filTablaR; i++) {
        tablaRealizados.deleteRow(filTablaR - i);
    }

    fetch('travels/')
        .then(response => response.json())
        .then(resp => {
            for (const elem of resp) {
                agregarViajesEnTablas(elem.name, elem.destinity_city, elem.start_date, elem.end_date, elem.description);
                //agregarPlanesEnTabla(elem.plans);
            }
            getPlanes();
        })
        .catch(error => console.log(error));
}

function getPlanes() {
    fetch('plans/')
        .then(response => response.json())
        .then(resp => {
            for (const elem of resp) {
                agregarPlanesEnTabla(elem.name, elem.description, elem.country);
            }
            getVuelos();
        })
        .catch(error => console.log(error));
}

function getVuelos() {
    fetch('flies/')
        .then(response => response.json())
        .then(resp => {
            for (const elem of resp) {
                agregarVuelosEnTabla(elem.company, elem.departure_date, elem.departure_hour, elem.departure_airport, elem.return_date, elem.return_hour, elem.return_airport, elem.reserve_code, elem.info_airplane, elem.scale_time);
            }
        })
        .catch(error => console.log(error));
}

function agregarViajesEnTablas(name, destinity_city, start_date, end_date, description) {
    let listFuturos = document.getElementById("tablaViajesFuturos");
    let listRealizados = document.getElementById("tablaViajesRealizados");
}

function agregarPlanesEnTabla(planes) {
    //let listFuturos = document.getElementById("tablaViajesFuturos");
    //let listRealizados = document.getElementById("tablaViajesRealizados");
    let fechaActual = new Date();
    listFuturos.innerHTML = "";
    listRealizados.innerHTML = "";
    for (let i = 0; i < planes.length; i++) {
        if(fechaActual.getFullYear() >= planes[i].start_date.getFullYear() &&
            fechaActual.getMonth() >= planes[i].start_date.getMonth() &&
            fechaActual.getDay() > planes[i].start_date.getDay()) {
            listFuturos.innerHTML += "<li>"
                + datos[i].id
                + "</li>"
        }

    }
}

function agregarVuelosEnTabla(company, departure_date, departure_hour, departure_airport, return_date, return_hour, return_airport, reserve_code, info_airplane, scale_time) {

}
