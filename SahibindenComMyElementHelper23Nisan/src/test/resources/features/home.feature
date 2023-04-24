@Sahibinden
Feature: Sahibinden

  @CheckResult
  Scenario: Check Search Result
    Given user should see the Home Page
    When taps "Emlak" on Home Page
    When taps "Konut" on Categories Page
    When taps "Satılık" on Categories Page
    When taps "Daire" on Categories Page
    When taps "Devam Et" button on Popup
    Then should see Results on Result Page
    Then should "sonuç bulundu" on Result Page


  @CheckFilters
  Scenario: Check Filters
    Given user should see the Home Page
    When taps "Vasıta" on Home Page
    When click cancel button on Popup
    When taps "Otomobil" on Categories Page
    When taps "Mazda" on Categories Page
    When taps "Lantis" on Categories Page
    When taps "1.8" on Categories Page
    When taps "Devam Et" button on Popup
    When taps filters on Result Page
    When taps "Fiyat" on Filters Page
    When sendkeys Max Price "350000" on Filters Page
    When click "TAMAM" on Filters Page
    When taps "Yıl" on Filters Page
    When sendkeys Min Year "1990" on Filters Page
    When click "TAMAM" on Filters Page
    When taps "İlan Tarihi" on Filters Page
    When choose "Son 30 gün içinde" on Filters Page
    When taps Show Results Button on Filters Page
    Then write the  "sonuç" results on  Result Page
    When taps "Sırala" on Results Page
   When select "Fiyata göre (Önce en yüksek)" on Result Page
   Then should see The cars  price high to low on Result Page



