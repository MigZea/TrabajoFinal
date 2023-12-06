const datosHistoricos = {
    "Ubicación A": { contaminante: "CO2", valores: [15, 18, 22, 20, 19], coordenadas: [-16.4, -71.5] },
    "Ubicación B": { contaminante: "NO2", valores: [10, 12, 14, 9, 11], coordenadas: [-16.35, -71.55] },
}
  
  const arequipaCoordinates = [-16.409, -71.5374];
  
  const map = L.map('map').setView(arequipaCoordinates, 13); // Establecer el nivel de zoom adecuado
  L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', ).addTo(map);
  
  const markers = [];
  for (const ubicacion in datosHistoricos) {
    const marker = L.marker(datosHistoricos[ubicacion].coordenadas).addTo(map);
    marker.bindTooltip(ubicacion).openTooltip();
    marker.datos = datosHistoricos[ubicacion];
    markers.push(marker);
  }
  
  function getRandom(min, max) {
    return Math.random() * (max - min) + min;
  }
  
  markers.forEach(marker => {
    marker.on('click', () => mostrarDatosHistoricos(marker.datos));
  });
  
  function mostrarDatosHistoricos(datos) {
    alert(`Contaminante: ${datos.contaminante}\nValores históricos: ${datos.valores.join(', ')}`);
  }
  