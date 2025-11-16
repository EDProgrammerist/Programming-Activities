#include <stdio.h>

int main() {
    float scores[10];
    float sum = 0.0, final_score;
    float max = 0.0, min = 10.0;

    printf("Please enter 10 scores:\n");

    // Input scores
    for (int i = 0; i < 10; i++) {
        scanf("%f", &scores[i]);

        // Track max and min
        if (scores[i] > max) max = scores[i];
        if (scores[i] < min) min = scores[i];

        sum += scores[i];
    }

    // Remove highest and lowest score
    sum = sum - max - min;

    // Compute average of remaining 8 scores
    final_score = sum / 8.0;

    printf("The final score is: %.2f\n", final_score);

    return 0;
}
