package MetricConverter;

class MetricConverter {
    double metersToCm(double meters) {
        return meters * 100;
    }

    double metersToMm(double meters) {
        return meters * 1000;
    }

    double cmToMeters(double cm) {
        return cm / 100;
    }

    double mmToMeters(double mm) {
        return mm / 1000;
    }
}