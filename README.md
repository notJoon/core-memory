# core-memory
ferrite core memory PCB &amp; firmware

## Gerber Files

Pre-generated Gerber files are in the `gerber/` directory and can be submitted to a PCB fabricator directly.

| File | Layer |
|------|-------|
| `CoreMem-F_Cu.gbr` | Front copper |
| `CoreMem-B_Cu.gbr` | Back copper |
| `CoreMem-F_Mask.gbr` | Front solder mask |
| `CoreMem-B_Mask.gbr` | Back solder mask |
| `CoreMem-F_SilkS.gbr` | Front silkscreen |
| `CoreMem-B_SilkS.gbr` | Back silkscreen |
| `CoreMem-Edge_Cuts.gbr` | Board outline |
| `CoreMem-PTH.drl` | Plated drill holes |
| `CoreMem-NPTH.drl` | Non-plated drill holes |

Zip the contents of `gerber/` and upload the archive to your fabricator (JLCPCB, PCBWay, OSH Park, etc.).

### Regenerating Gerber Files

If you modify `CoreMem.kicad_pcb`, regenerate the files with KiCad 5 or later.

**Prerequisites:** [KiCad](https://www.kicad.org/) 5.x or later

1. Open `CoreMem.kicad_pcb` in KiCad PCB Editor (Pcbnew).
2. Go to **File** and select **Plot**.
3. Set the output directory to `gerber/`.
4. Select the following layers: `F.Cu`, `B.Cu`, `F.SilkS`, `B.SilkS`, `F.Mask`, `B.Mask`, `Edge.Cuts`.
5. Make sure **Use Protel filename extensions** is unchecked and **Generate Gerber job file** is unchecked.
6. Click **Plot**.
7. Click **Generate Drill Files**, keep the defaults, and click **Generate Drill File**.
8. Zip the `gerber/` directory and submit to your fabricator.
