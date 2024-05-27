int canCompleteCircuit(int* gas, int gasSize, int* cost, int costSize) {
    int start = 0, gasi = 0, cos = 0, sub = 0;

    for (int i = 0; i < gasSize; i++) {
        gasi += gas[i];
        cos += cost[i];
    }

    if (cos > gasi) {
        return -1;
    }

    for (int i = 0; i < gasSize; i++) {
        sub += gas[i] - cost[i];
        if (sub < 0) {
            sub = 0;
            start = i + 1;
        }
    }

    return start;
}

