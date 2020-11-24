package com.iesportada.converterqtjambi;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;
import javax.swing.JOptionPane;

public class MainWindow implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QWidget centralwidget;
    public QWidget verticalLayoutWidget;
    public QVBoxLayout verticalLayout_2;
    public QGridLayout gridLayout_8;
    public QLabel titleLabel;
    public QSpacerItem horizontalSpacer;
    public QSpacerItem horizontalSpacer_2;
    public QSpacerItem verticalSpacer_3;
    public QSpacerItem verticalSpacer_4;
    public QGridLayout gridLayout_7;
    public QLabel fromLabel;
    public QLabel toLabel;
    public QSpacerItem horizontalSpacer_7;
    public QSpacerItem horizontalSpacer_6;
    public QComboBox fromCurrencyComboBox;
    public QComboBox toCurrencyComboBox;
    public QSpacerItem horizontalSpacer_5;
    public QSpacerItem horizontalSpacer_3;
    public QSpacerItem horizontalSpacer_4;
    public QGridLayout gridLayout_2;
    public QLabel amountLabel;
    public QLabel resultLabel;
    public QSpacerItem horizontalSpacer_9;
    public QLineEdit returnConvertedAmountTextField;
    public QSpacerItem horizontalSpacer_8;
    public QLineEdit amountInputTextField;
    public QGridLayout gridLayout_6;
    public QPushButton convertPushButton;
    public QSpacerItem horizontalSpacer_11;
    public QSpacerItem horizontalSpacer_10;
    public QSpacerItem verticalSpacer_2;
    public QStatusBar statusbar;
    public QLabel feedbackLabel;


    public MainWindow() { super(); }
    
    Utils utils = new Utils();

    public void setupUi(QMainWindow MainWindow)
    {
        MainWindow.setObjectName("MainWindow");
        MainWindow.resize(new QSize(710, 444).expandedTo(MainWindow.minimumSizeHint()));
        centralwidget = new QWidget(MainWindow);
        centralwidget.setObjectName("centralwidget");
        verticalLayoutWidget = new QWidget(centralwidget);
        verticalLayoutWidget.setObjectName("verticalLayoutWidget");
        verticalLayoutWidget.setGeometry(new QRect(0, 0, 701, 421));
        verticalLayout_2 = new QVBoxLayout(verticalLayoutWidget);
        verticalLayout_2.setObjectName("verticalLayout_2");
        gridLayout_8 = new QGridLayout();
        gridLayout_8.setObjectName("gridLayout_8");
        titleLabel = new QLabel(verticalLayoutWidget);
        titleLabel.setObjectName("titleLabel");
        QFont font = new QFont();
        font.setFamily("Alef");
        font.setPointSize(24);
        font.setBold(true);
        font.setItalic(true);
        font.setWeight(75);
        titleLabel.setFont(font);

        gridLayout_8.addWidget(titleLabel, 1, 1, 1, 1);

        horizontalSpacer = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_8.addItem(horizontalSpacer, 1, 0, 1, 1);

        horizontalSpacer_2 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_8.addItem(horizontalSpacer_2, 1, 2, 1, 1);

        verticalSpacer_3 = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout_8.addItem(verticalSpacer_3, 0, 1, 1, 1);

        verticalSpacer_4 = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout_8.addItem(verticalSpacer_4, 2, 1, 1, 1);


        verticalLayout_2.addLayout(gridLayout_8);

        gridLayout_7 = new QGridLayout();
        gridLayout_7.setObjectName("gridLayout_7");
        fromLabel = new QLabel(verticalLayoutWidget);
        fromLabel.setObjectName("fromLabel");
        QFont font1 = new QFont();
        font1.setFamily("Alef");
        font1.setPointSize(18);
        font1.setBold(true);
        font1.setWeight(75);
        fromLabel.setFont(font1);

        gridLayout_7.addWidget(fromLabel, 0, 1, 1, 1);

        toLabel = new QLabel(verticalLayoutWidget);
        toLabel.setObjectName("toLabel");
        QFont font2 = new QFont();
        font2.setFamily("Alef");
        font2.setPointSize(18);
        font2.setBold(true);
        font2.setWeight(75);
        toLabel.setFont(font2);

        gridLayout_7.addWidget(toLabel, 0, 6, 1, 1);

        horizontalSpacer_7 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_7.addItem(horizontalSpacer_7, 0, 7, 1, 1);

        horizontalSpacer_6 = new QSpacerItem(80, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_7.addItem(horizontalSpacer_6, 0, 2, 1, 1);

        fromCurrencyComboBox = new QComboBox(verticalLayoutWidget);
        fromCurrencyComboBox.setObjectName("fromCurrencyComboBox");
        QFont font3 = new QFont();
        font3.setFamily("Alef");
        font3.setPointSize(18);
        font3.setBold(true);
        font3.setWeight(75);
        fromCurrencyComboBox.setFont(font3);

        gridLayout_7.addWidget(fromCurrencyComboBox, 0, 4, 1, 1);

        toCurrencyComboBox = new QComboBox(verticalLayoutWidget);
        toCurrencyComboBox.setObjectName("toCurrencyComboBox");
        QFont font4 = new QFont();
        font4.setFamily("Alef");
        font4.setPointSize(18);
        font4.setBold(true);
        font4.setWeight(75);
        toCurrencyComboBox.setFont(font4);

        gridLayout_7.addWidget(toCurrencyComboBox, 0, 8, 1, 1);

        horizontalSpacer_5 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_7.addItem(horizontalSpacer_5, 0, 5, 1, 1);

        horizontalSpacer_3 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_7.addItem(horizontalSpacer_3, 0, 9, 1, 1);

        horizontalSpacer_4 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_7.addItem(horizontalSpacer_4, 0, 0, 1, 1);


        verticalLayout_2.addLayout(gridLayout_7);

        gridLayout_2 = new QGridLayout();
        gridLayout_2.setObjectName("gridLayout_2");
        amountLabel = new QLabel(verticalLayoutWidget);
        amountLabel.setObjectName("amountLabel");
        QFont font5 = new QFont();
        font5.setFamily("Alef");
        font5.setPointSize(18);
        font5.setBold(true);
        font5.setWeight(75);
        amountLabel.setFont(font5);

        gridLayout_2.addWidget(amountLabel, 0, 1, 1, 1);

        resultLabel = new QLabel(verticalLayoutWidget);
        resultLabel.setObjectName("resultLabel");
        QFont font6 = new QFont();
        font6.setFamily("Alef");
        font6.setPointSize(18);
        font6.setBold(true);
        font6.setWeight(75);
        resultLabel.setFont(font6);

        gridLayout_2.addWidget(resultLabel, 0, 3, 1, 1);

        horizontalSpacer_9 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_2.addItem(horizontalSpacer_9, 0, 5, 1, 1);

        returnConvertedAmountTextField = new QLineEdit(verticalLayoutWidget);
        returnConvertedAmountTextField.setObjectName("returnConvertedAmountTextField");
        returnConvertedAmountTextField.setEnabled(false);

        gridLayout_2.addWidget(returnConvertedAmountTextField, 0, 4, 1, 1);

        horizontalSpacer_8 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_2.addItem(horizontalSpacer_8, 0, 0, 1, 1);

        amountInputTextField = new QLineEdit(verticalLayoutWidget);
        amountInputTextField.setObjectName("amountInputTextField");

        gridLayout_2.addWidget(amountInputTextField, 0, 2, 1, 1);


        verticalLayout_2.addLayout(gridLayout_2);

        gridLayout_6 = new QGridLayout();
        gridLayout_6.setObjectName("gridLayout_6");
        convertPushButton = new QPushButton(verticalLayoutWidget);
        convertPushButton.setObjectName("convertPushButton");
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(convertPushButton.sizePolicy().hasHeightForWidth());
        convertPushButton.setSizePolicy(sizePolicy);
        QFont font7 = new QFont();
        font7.setFamily("Alef");
        font7.setPointSize(12);
        font7.setBold(true);
        font7.setWeight(75);
        convertPushButton.setFont(font7);
        convertPushButton.setIconSize(new QSize(10, 10));

        gridLayout_6.addWidget(convertPushButton, 0, 1, 1, 1);

        horizontalSpacer_11 = new QSpacerItem(300, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_6.addItem(horizontalSpacer_11, 0, 2, 1, 1);

        horizontalSpacer_10 = new QSpacerItem(300, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Preferred, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        gridLayout_6.addItem(horizontalSpacer_10, 0, 0, 1, 1);

        verticalSpacer_2 = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        gridLayout_6.addItem(verticalSpacer_2, 1, 1, 1, 1);


        verticalLayout_2.addLayout(gridLayout_6);

        MainWindow.setCentralWidget(centralwidget);
        statusbar = new QStatusBar(MainWindow);
        statusbar.setObjectName("statusbar");
        MainWindow.setStatusBar(statusbar);
        retranslateUi(MainWindow);

        MainWindow.connectSlotsByName();
        
        convertPushButton.clicked.connect(this, "showMeFeedback()");
        
    } // setupUi
    
    private void showMeFeedback(){
        
        
       if(amountInputTextField.text().matches("^[0-9]*$") && amountInputTextField.text().length()>2){
        utils.setFromCurrency(fromCurrencyComboBox.currentText());
        utils.setToCurrency(toCurrencyComboBox.currentText());
        utils.setIncommingQuantity(amountInputTextField.text());
        returnConvertedAmountTextField.setText(utils.convertedQuantity());
       }
       else{
        JOptionPane.showConfirmDialog(null, Constants.ERROR_MESSAGE, "Error", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);

       }
    }

    void retranslateUi(QMainWindow MainWindow)
    {
        MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow", null));
        titleLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Convertidor de monedas", null));
        fromLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "De:", null));
        toLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "A:", null));
        fromCurrencyComboBox.clear();
        fromCurrencyComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Euro", null));
        fromCurrencyComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Libra", null));
        fromCurrencyComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Franco", null));
        fromCurrencyComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Dolar", null));
        toCurrencyComboBox.clear();
        toCurrencyComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Euro", null));
        toCurrencyComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Libra", null));
        toCurrencyComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Franco", null));
        toCurrencyComboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Dolar", null));
        amountLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Cantidad:", null));
        resultLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Resultado:", null));
        convertPushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Convertir", null));
    } // retranslateUi

}



