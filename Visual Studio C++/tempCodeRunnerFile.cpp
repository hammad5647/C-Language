#include <QApplication>
#include <QLabel>
#include <QTimer>
#include <QTime>

int main(int argc, char *argv[]) {
    QApplication app(argc, argv);

    QLabel label("Desktop Clock");
    label.setAlignment(Qt::AlignCenter);
    label.show();

    QTimer timer;
    QObject::connect(&timer, &QTimer::timeout, [&label]() {
        label.setText(QTime::currentTime().toString("hh:mm:ss AP"));
    });
    timer.start(1000);

    return app.exec();
}
